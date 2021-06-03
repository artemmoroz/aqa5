package by.issoft.testng;

import by.issoft.reporting.AllureScreenListener;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.testng.ScreenShooter;
import org.openqa.selenium.MutableCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Map;

public class MyFirstTest extends BaseTest {


    @BeforeSuite
    public void aaa(){
        ScreenShooter.captureSuccessfulTests = true;
    }

    @BeforeMethod
    public void bbb() {
        System.out.println("im logging in");

    }

    @AfterMethod
    public void ccc() {
        System.out.println("logout");
    }


    @Test
    @Parameters({"www", "age"})
    public void doTest(String userName, int age) {

        Configuration.startMaximized = true;
        Configuration.headless = true;

        Map<String, String> caps;
        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.setCapability("key", "value");

        Configuration.browserCapabilities = mutableCapabilities;

        System.out.println(userName + " -- " + age);
        //read from file//
        //Files.readAllBytes()
        //object mapper
        int actual = 2 + 2;
        int expected = 5;
        Assert.assertEquals(actual, expected, "users quantity not equals");

        Object a = Selenide.executeJavaScript("return 10;");

    }

    @Test(dataProvider = "nameArray")
    public void doTest2(String name, int age) {
        Selenide.open("https://ya.ru/");
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
