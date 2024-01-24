package ComplexCalculator.ComplexLogger;

import ComplexCalculator.ComplexNumber;

import java.io.FileWriter;
import java.io.IOException;

public class LogTXT implements Log {
    @Override
    public String getExpression(ComplexNumber x, ComplexNumber y, String operation, ComplexNumber result) {
        String op = "";
        if (operation.equals("+")) {
            return String.format("(%s + %s) (%s + %s) = %s " , x.getReal(), y.getReal(), x.getImag(), y.getImag() , result);
        } else if (operation.equals("-")) {

            return String.format("(%s - %s) (%s - %s) = %s " , x.getReal(), y.getReal(), x.getImag(), y.getImag() , result);
        } else if (operation.equals("*")) {

            return String.format("(%s * %s) - (%s * %s) " +
                            "(%s * %s) + (%s * %s) = %s", x.getReal(), y.getReal(), x.getImag(), y.getImag(),
                    x.getReal(), y.getImag(), x.getImag(), y.getReal(), result);
        } else {
            op = " ? ";
        }
        return String.format("%s%s%s = %s ", x, op, y, result);
    }

    @Override
    public void writeFile(String expression, String nameFile) {
        try (FileWriter fw = new FileWriter(nameFile, true)) {
            fw.write(expression + ";");
            fw.append('\n');
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
