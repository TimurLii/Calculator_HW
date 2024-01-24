package ComplexCalculator;


import ComplexCalculator.ComplexLogger.Log;
import ComplexCalculator.ComplexLogger.LogTXT;

public class ComplexCalculator {
    ComplexCommand comCalc = new ComplexCommand();
    public void complexCalculatorRun(String command, ComplexNumber comNum1, ComplexNumber comNum2) {
        Log log = new LogTXT();
        String txt = "";

        switch (command) {
            case "+":
                comCalc.addition(comNum1, comNum2);
                ComplexNumber resultAdd = comCalc.addition(comNum1, comNum2);
                txt = log.getExpression(comNum1, comNum2, command, resultAdd);
                break;
            case "-":
                ComplexNumber resultSub = comCalc.subtract(comNum1, comNum2);
                comCalc.subtract(comNum1, comNum2);
                txt = log.getExpression(comNum1, comNum2, command, resultSub);
                break;
            case "*":
                ComplexNumber resultMul = comCalc.multiply(comNum1, comNum2);
                comCalc.multiply(comNum1, comNum2);
                txt = log.getExpression(comNum1, comNum2, command, resultMul);
                break;
            default:
                System.out.println("Invalid character!!");
                System.exit(0);
                break;
        }
        log.writeFile(txt, "src\\ComplexCalculator\\ComplexLogger\\ComplexCalculator.txt");
    }
}
