package by.issoft.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Data;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseSelTest {

    ThreadLocal<WebDriver> driverTL = new ThreadLocal<>();

    protected WebDriver getDriver(){
        WebDriver driver = driverTL.get();
        if(driver==null){
            //setup
        }
        return driver;
    }

    WebDriver driver;

    @BeforeMethod
    @Parameters
    public void initDriver(){
        //read from cl or config
        WebDriverManager.chromedriver().setup();
        //or System.setProperty("webdriver.chrome...exe)

        ChromeOptions options = new ChromeOptions();
        options.setCapability("maximized", true);

        driver = new ChromeDriver(options);
    }


    @AfterMethod
    public void closeAll(){
        driver.quit();
        driver.close();
    }


}
