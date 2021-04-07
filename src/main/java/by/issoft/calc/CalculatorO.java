package by.issoft.calc;

@Deprecated
public class CalculatorO {
    private Double lastResult;

    private double plus(double first, double second) {
        System.out.println(first + "+" + second);
        return first + second;
    }

    private double minus(double first, double second) {
        return first - second;
    }

    private double multiply(double first, double second) {
        return first * second;
    }

    private double divide(double first, double second) {
        return first / second;
    }

    public int do1() {
        return 1;
    }

    public void printResult(double result) {
        if (result % 1 > 0) {
            System.out.println("result " + result);
        } else {
            System.out.println("result " + (int) result);
        }

        boolean s = true;
        int res = 0;
        if (do1() > 3) {
            res = 15;
        } else {
            res = 1;
        }

        int res1 = do1() > 3 ? 15 : 1;

        System.out.println("lastResult " + lastResult);
        lastResult = result;
    }

    public static void main(String[] args) {
        CalculatorO c = new CalculatorO();
        double result = c.plus(3, 2);
        c.printResult(result);


        System.out.println("3-2");
        result = c.minus(5, 2);
        c.printResult(result);


        System.out.println("3*2");
        result = c.multiply(3, 2);
        c.printResult(result);


        System.out.println("10.50/2");
        result = c.divide(10.50, 2);
        c.printResult(result);

    }
}