package by.issoft;

import lombok.Data;
import lombok.experimental.Accessors;
import org.testng.Assert;

public class TestSample {


    public boolean doTest() {
        int actual = 2 + 2;
        int expected = 5;
        Assert.assertEquals(actual, expected, "users quantity not equals");
        if(actual==expected){
            System.out.println("it ok");
            //**///**/*/
            //if(dfsdfsd){
            //  step2
            // }
            //else{
            //
            // }
            return true;
        }else{
            System.out.println("ne ok");
            return false;
        }

    }

    public void doTest2() {
        System.out.println("1111");
        int actual = 2 + 2;
        int expected = 4;
        Assert.assertEquals(actual, expected, "users quantity not equals");
    }

    public static void main(String[] args) {
        TestSample testSample = new TestSample();
        testSample.doTest();
        testSample.doTest2();
    }
}
