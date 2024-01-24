package SimpleCalculator.SimpleLogger;
import java.io.IOException;
import java.io.FileWriter;

public class LogTXT implements Log {
    @Override
    public String getExpression(Integer x, Integer y, String operation,Integer result) {
        String op = "";
        if (operation.equals("+"))
            op = " + ";
        else if (operation.equals("-"))
            op = " - ";
        else if (operation.equals("*"))
            op = " * ";
        else
            op = " ? ";
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
