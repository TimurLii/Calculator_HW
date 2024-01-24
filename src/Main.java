import ComplexCalculator.ComplexCalculator;
import SimpleCalculator.SimpleCalculator;
import View.View;

import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {


        View view = new View( new SimpleCalculator(), new ComplexCalculator());
        view.run();
    }
}
