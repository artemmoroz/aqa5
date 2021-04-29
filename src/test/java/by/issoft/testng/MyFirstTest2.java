package by.issoft.testng;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyFirstTest2 {

    @Test
    @Parameters({"www", "age"})
    public void doTest(String userName, int age) {
        System.out.println(userName + " -- "+ age);
        int actual = 2 + 2;
        int expected = 4;
        System.out.println("HHHH");
        Assert.assertEquals(actual, expected, "use2rs quantity not equals");
    }

    @Test
    public void doTest2() {
        int actual = 2 + 2;
        int expected = 6;
        System.out.println("555555");
        Assert.assertEquals(actual, expected, "users quan6tity not equals");
    }


}
