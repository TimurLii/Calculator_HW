package ComplexCalculator.ComplexLogger;

import ComplexCalculator.ComplexNumber;

public interface Log {
    public void writeFile(String expression, String nameFile);
    public String getExpression(ComplexNumber x, ComplexNumber y, String operation, ComplexNumber result);
}
