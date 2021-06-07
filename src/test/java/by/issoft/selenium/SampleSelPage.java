package by.issoft.selenium;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import lombok.experimental.Accessors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.$;

public class SampleSelPage extends BaseSelPage{

    SelenideElement login = $("xxxx");

    @FindBy(css = "xxxx")
    WebElement loginS;

    String cssLoc = "xxxx";

    By locCss = By.cssSelector("xxxx");
    WebElement loginS2;

    public SampleSelPage(WebDriver webDriver) {
        super(webDriver);
    }


    public void doLogin(){
        //login.click();
        loginS.click();//->NPE

        driver.findElement(By.cssSelector(cssLoc)).click();

        loginS2 = driver.findElement(locCss);
    }
}
