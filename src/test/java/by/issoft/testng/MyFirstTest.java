package by.issoft.testng;

import lombok.Data;
import lombok.experimental.Accessors;
import org.testng.Assert;
import org.testng.annotations.*;

import java.nio.file.Files;


public class MyFirstTest extends BaseTest{


    @BeforeMethod
    public void bbb(){
        System.out.println("im logging in");
    }

    @AfterMethod
    public void ccc(){
        System.out.println("logout");
    }


    @Test
    @Parameters({"www", "age"})
    public void doTest(String userName, int age) {
        System.out.println(userName + " -- " + age);
        //read from file//
        //Files.readAllBytes()
        //object mapper
        int actual = 2 + 2;
        int expected = 5;
        Assert.assertEquals(actual, expected, "users quantity not equals");
    }

    @Test(dataProvider = "nameArray")
    public void doTest2(String name, int age) {

        Assert.assertTrue(name.length() > 5, "Name is to short");
    }

    @DataProvider
    public Object[][] nameArray() {
        Object[][] matrix = new Object[2][2];
        matrix[0][0] = "Artem";
        matrix[0][1] = 3;
        matrix[1][0] = "Bob";
        matrix[1][1] = 56;
        return matrix;
    }


}
