package by.issoft.selenium;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Data;
import lombok.experimental.Accessors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelTest extends BaseSelTest{

    SampleSelPage page = new SampleSelPage(driver);


    @Test
    public void ttt(){
  //sec1     // open(""http://ya.ru");

//        WebDriverManager.chromedriver().setup();
//        //or System.setProperty("webdriver.chrome...exe)
//
//        ChromeOptions options = new ChromeOptions();
//        options.setCapability("maximized", true);
//
//        WebDriver driver = new ChromeDriver(options);

        driver.get("http://ya.ru");
///-------------------
// sec2
        //$x("loc").click();

       // driver.findElement(By.xpath("loc")).click();

        //$$x("loc");
        //driver.findElements(By.cssSelector("xxfsdfsdf"));


        //------------
        //sec3
       // $("xczvzxv").waitUntil(visible, 500);

//        WebElement webElement = driver.findElement(By.cssSelector("xczvzxv"));
//        WebDriverWait wait = new WebDriverWait(driver, 500);
//        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
}
