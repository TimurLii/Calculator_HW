package SimpleCalculator;


public class Command implements Commandable {
    @Override
    public Integer multiply(Integer num1, Integer num2) {
        System.out.println("Result : " + (num1 * num2));
        return num1 * num2;
    }

    @Override
    public Integer subtract(Integer num1, Integer num2) {
        System.out.println("Result : " + (num1 - num2));
        return num1 - num2;
    }

    @Override
    public Integer Addition(Integer num1, Integer num2) {
        System.out.println("Result : " + (num1 + num2));
        return num1 + num2;

    }

}
