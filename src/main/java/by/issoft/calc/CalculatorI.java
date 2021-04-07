package by.issoft.calc;

import java.util.Scanner;

@Deprecated
public class CalculatorI {
    public static double firstNumber;
    public static double secondNumber;
    public static double result;
    public static double prevResult;

    public static void printResult(double result) {
        System.out.println("Your result:" + result);
        System.out.println("Previous result:" + prevResult);
        prevResult = result;
    }

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter first number:");
            firstNumber = in.nextDouble();
            System.out.println("Enter second number:");
            secondNumber = in.nextDouble();
            System.out.println("Enter number for operation:");
            System.out.println("1 - Sum +");
            System.out.println("2 - Sub -");
            System.out.println("3 - Multi *");
            System.out.println("4 - Div /");
            int num = in.nextInt();
            if (num == 1) {
                result = sum(firstNumber, secondNumber);
                printResult(result);
            } else if (num == 2) {
                printResult(sub(firstNumber, secondNumber));
            } else if (num == 3) {
                result = multi(firstNumber, secondNumber);
                printResult(result);
            } else if (num == 4) {
                result = div(firstNumber, secondNumber);
                printResult(result);
            }
            else System.out.println("Operation is not defined");

            switch (num) {

                case 1: {
                    printResult(sum(firstNumber, secondNumber));
                    break;
                }
                case 2: {
                    printResult(sub(firstNumber, secondNumber));
                    break;
                }
                case 3:
                case 4: {
                    printResult(multi(firstNumber, secondNumber));
                    break;
                }

                default:{
                    System.out.println("Operation is not defined");
                }
            }


            System.out.println("Enter '0' if you want to close the program, '1' if continue");
            int stopPoint = in.nextInt();
            if (stopPoint == 0) break;
        }
    }

    public static double sum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double sub(double firstNumber, double secondNumber) {
        double sub = firstNumber - secondNumber;
        System.out.println("Your result:" + sub);
        return sub;
    }

    public static double multi(double firstNumber, double secondNumber) {
        double multi = firstNumber * secondNumber;
        System.out.println("Your result:" + multi);
        return multi;
    }

    public static double div(double firstNumber, double secondNumber) {
        double div = firstNumber / secondNumber;
        System.out.println("Your result:" + div);
        return div;
    }
}