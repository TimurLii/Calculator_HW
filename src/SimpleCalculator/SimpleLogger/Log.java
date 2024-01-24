package SimpleCalculator.SimpleLogger;

public interface Log {
    public void writeFile(String expression, String nameFile);
    public String getExpression(Integer x, Integer y, String operation, Integer result);
}
