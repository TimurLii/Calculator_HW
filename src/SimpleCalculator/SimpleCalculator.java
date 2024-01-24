package SimpleCalculator;

import SimpleCalculator.SimpleLogger.Log;
import SimpleCalculator.SimpleLogger.LogTXT;

public class SimpleCalculator {
    Command com = new Command();
    public void simpleCalculatorRun(String command, Integer num1, Integer num2) {
        Log log = new LogTXT();
        String txt = "";
        switch (command) {
            case "+":
                Integer resultAdd = com.Addition(num1, num2);
                txt = log.getExpression(num1, num2, command, resultAdd);
                break;
            case "-":
                Integer resultSub = com.subtract(num1, num2);
                txt = log.getExpression(num1, num2, command,resultSub);
                break;
            case "*":
                Integer resultMul = com.multiply(num1, num2);
                txt = log.getExpression(num1, num2, command, resultMul);
                break;
            default:
                System.out.println("Invalid character!!");
                System.exit(0);
                break;
        }
        log.writeFile(txt, "src\\SimpleCalculator\\SimpleLogger\\SimpleCalculator.txt");
    }
}
