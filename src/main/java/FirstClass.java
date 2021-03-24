public class FirstClass {

    public int x = 3;//0,1,2,-456  -- 0
    public double d = 6; // 6.453, -7.45345 -- 0.0
    public String str = "tst"; // "my name is" -- null
    public boolean flag = true; // true false -- false

    public MyCompositeName compositeName;// -- null

    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        System.out.println(firstClass.x);
        System.out.println(firstClass.d);
        System.out.println(firstClass.str);
        System.out.println(firstClass.flag);
        System.out.println(firstClass.compositeName);
        firstClass.myFirstMethod();
        firstClass.mySecondMethod(6);
        firstClass.myThirdMethod(3);
    }


    public int myZeroMethod(){
        System.out.println("hello 0");
        int localOne = 5;
        int result = localOne * 10;
        System.out.println("Result 0" + localOne);
        return result;
    }

    public void myFirstMethod(){
        System.out.println("hello");
        int localOne = 5;
        localOne = localOne * 10;
        System.out.println("Result " + localOne);
    }

    public void mySecondMethod(int localOne){
        System.out.println("hello 2");
        localOne = localOne * 10;
        System.out.println("Result 2 " + localOne);
    }

    public void myThirdMethod(int localOne){
        System.out.println("hello 3");
        localOne = localOne * x;
        System.out.println("Result 3 " + localOne);
    }



}
