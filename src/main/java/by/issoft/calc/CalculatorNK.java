package by.issoft.calc;

@Deprecated
public class CalculatorNK {
    int prev = 0;//double
    public static void main(String[] args){
        CalculatorNK c = new CalculatorNK();
        c.sum(10,5);
        c.umn(4,2);
        c.del(10,5);
        c.min(10,5);
    }
    public int sum(int num1, int num2) {
        int result;
        result = num1 + num2;
        return print(result);
    }
    public int umn(int num1, int num2) {
        int result;
        result = num1 * num2;
        return print(result);
    }
    public int del(int num1, int num2) {
        int result;
        result = num1 / num2;
        return print(result);
    }
    public int min(int num1, int num2){
        int result;
        result = num1 - num2;
        return print(result);
    }
    private int print(int result){
        System.out.println(result+" "+prev);
        prev = result;
        return result;
    }
}