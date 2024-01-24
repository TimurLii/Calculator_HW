package View;

import ComplexCalculator.ComplexCalculator;


import SimpleCalculator.SimpleCalculator;

import java.util.Scanner;

import ComplexCalculator.ComplexNumber;

public class View {
    SimpleCalculator simCalc;
    ComplexCalculator comCalc;



    public View(SimpleCalculator simCalc, ComplexCalculator comCalc) {

        this.simCalc = simCalc;
        this.comCalc = comCalc;
    }

    public void run() {

        while (true) {
            String type = getTypeCalculator();
            if (type.equals("1")) {
                String command = getOperator();
                Integer num1 = getInt();
                Integer num2 = getInt();
                simCalc.simpleCalculatorRun(command, num1, num2);
            }
            if (type.equals("2")) {
                String command = getOperator();
                System.out.print("Enter number 1: ");
                double realNum1 = getDouble();
                System.out.print("Enter imaginary number 1 : ");
                double imagNum1 = getDouble();
                System.out.print("Enter number 2: ");
                double realNum2 = getDouble();
                System.out.print("Enter imaginary number 2 : ");
                double imagNum2 = getDouble();
                ComplexNumber comNum1 = new ComplexNumber(realNum1, imagNum1);
                ComplexNumber comNum2 = new ComplexNumber(realNum2, imagNum2);

                comCalc.complexCalculatorRun(command, comNum1, comNum2);
            } else {
                String exit = exit();
                if (!exit.equalsIgnoreCase("y")) {
                    System.exit(0);
                }

            }

        }

    }

    private String getTypeCalculator() {
        return prompt("1.Simple calculator\n" +
                "2.Complex calculator\n" +
                "Enter calculator type  : ");
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.printf(message);
        return in.nextLine();
    }

    private String exit() {
        Scanner in = new Scanner(System.in);
        System.err.println("Continue?... (y/n)");
        return in.nextLine();
    }

    private Integer getInt() {
        return Integer.valueOf(prompt("Enter  number: "));
    }

    private double getDouble() {
        return Double.parseDouble((prompt("")));
    }


    private String getOperator() {
        return prompt("Enter command : + / - / * : ");
    }


}
