package by.issoft.ui;

import by.issoft.oop.Car;
import org.testng.annotations.*;

import java.util.List;

public class SendUiTest extends BaseLoginTest{


    @BeforeMethod
    public void login() {
        //open("github.com")
        //login - setValues and click login
        //-- fill form
    }

    @BeforeMethod(dependsOnMethods = "login")
    public void fillForm() {
        // fill form
    }

    private void nonUniqueFillForm() {
        //fill form
    }

    @Test
    @Parameters("name")
    public void testPullReq(String name) {
        //String name = "artemmoroz";
        // -db/api- create pull req
        //open browser -- use current & open main page
        // -- create pull req
        String name2 = "xfafag";//faker
        //go to pull req
        //assert!
        // clear & close browser*
    }

    @Test
    public void testSecurity() {
        Car car = (Car) getData("ID72");
        //input1.setValue(car.toString());
        nonUniqueFillForm();
// initial state - pull req
    }

    @Test
    public void testSecurityCar(Car car) {

        //input1.setValue(car.toString());
        nonUniqueFillForm();
// initial state - pull req
    }

    @Test
    public void testSecurityCar2(String model, String color) {

        //input1.setValue(car.toString());
        nonUniqueFillForm();
// initial state - pull req
    }

    @DataProvider
    public Object[][] data1(){
       List<Car> carList = (List<Car>) getData("ftsafday");
       //carList-->object[][];
       return null;
    }

    @AfterMethod
    public void after(){
        //driver.close()
        //Selenide.close()

        //clean up system
        //given().delete("user");
    }
}
