package by.issoft.selenium;

import lombok.Data;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

@Data
@Accessors(chain = true)
public class BaseSelPage {

    protected WebDriver driver;

    public BaseSelPage(WebDriver webDriver) {
        driver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

}
