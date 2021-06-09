package by.issoft.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Data;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

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
    public void initDriver() throws MalformedURLException {
        //read from cl or config
        WebDriverManager.chromedriver().setup();
        //or System.setProperty("webdriver.chrome...exe)

        ChromeOptions options = new ChromeOptions();
        options.setCapability("maximized", true);

        driver = new  ChromeDriver(options);




        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os", "OS X");
        caps.setCapability("os_version", "Catalina");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "90.0");
        caps.setCapability("resolution", "1600x1200");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.14.0");

        driver = new RemoteWebDriver(new URL("xxx"), caps);
    }


    @AfterMethod
    public void closeAll(){
        driver.quit();
        driver.close();
    }


}
