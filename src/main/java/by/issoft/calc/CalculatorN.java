package by.issoft.calc;
import java.util.Scanner;
@Deprecated
public class CalculatorN {

    double firstUserNumber;
    double secondUserNumber;
    int action;
    double calculationResult;
    double previousResult;


    public static void main(String[] args){

        CalculatorN calculator = new CalculatorN();
        Scanner input = new Scanner(System.in);
        calculator.action = 1;
        String continueCalc;

        do{
            calculator.previousResult = calculator.calculationResult;

            System.out.print("Enter the first number: ");
            calculator.firstUserNumber = input.nextDouble();

            System.out.print("Enter the second number: ");
            calculator.secondUserNumber = input.nextDouble();

            System.out.print("Enter '1' for summarizing numbers; " +
                    "'2' for Subtraction; '3' for multiplication, '4' for division: ");
            calculator.action = input.nextInt();

            if (calculator.action == 1){
                calculator.calculationResult = calculator.methodAdding();
            }

            if (calculator.action == 2){
                calculator.calculationResult = calculator.methodSubtraction();
            }

            if (calculator.action == 3){
                calculator.calculationResult = calculator.methodMultiplication();
            }

            if (calculator.action == 4){
                calculator.calculationResult = calculator.methodDivision();
            }

            System.out.println("Result = " + calculator.calculationResult);
            System.out.println("The previous result = " + calculator.previousResult);

            System.out.print("Want to continue (y - yes, n - no)? ");
            continueCalc = input.next();
        }
        while (!continueCalc.equals("n"));

        input.close();

    }

    public double methodAdding (){
        double result = firstUserNumber + secondUserNumber;
        return result;

    }

    public double methodSubtraction (){
        double result = firstUserNumber - secondUserNumber;
        return result;

    }

    public double methodMultiplication (){
        double result = firstUserNumber * secondUserNumber;
        return result;

    }

    public double methodDivision (){
        double result = firstUserNumber / secondUserNumber;
        return result;

    }



}
