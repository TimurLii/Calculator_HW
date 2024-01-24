package ComplexCalculator;

public class ComplexCommand implements ComplexCommandable {


    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        double realResult = num1.getReal() * num2.getReal() - num1.getImag() * num2.getImag();
        double imagResult = num1.getReal() * num2.getImag() + num1.getImag() * num2.getReal();
        System.out.println("Result : " + new ComplexNumber(realResult, imagResult));
        return new ComplexNumber(realResult, imagResult);
    }

    @Override
    public ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2) {
        double realResult = num1.getReal() - num2.getReal();
        double imagResult = num1.getImag() - num2.getImag();
        System.out.println("Result : " + new ComplexNumber(realResult, imagResult));
        return new ComplexNumber(realResult, imagResult);

    }

    @Override
    public ComplexNumber addition(ComplexNumber num1, ComplexNumber num2) {
        double realResult = num1.getReal() + num2.getReal();
        double imagResult = num1.getImag() + num2.getImag();
        System.out.println("Result : " + new ComplexNumber(realResult, imagResult));
        return new ComplexNumber(realResult, imagResult);
    }
}
