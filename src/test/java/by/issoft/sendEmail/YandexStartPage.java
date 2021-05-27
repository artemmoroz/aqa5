package by.issoft.sendEmail;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
@Data
public class YandexStartPage {

//    String loginButton = ".desk-notif-card__card >div> a:nth-child(1)";
//    String newEmailLink = ".desk-notif-card__toggled div:nth-of-type(%d)";
//
//    By cssLoginButton = By.cssSelector("xxxx");

    SelenideElement loginButton = $x(".desk-notif-card__card >div> a:nth-child(1)");
    SelenideElement newEmailLink = $x(".desk-notif-card__toggled div:nth-of-type(1)");

//    public void clickLoginButton() {
//        loginButton2.click();
//        //sdfsdf
//    }
//
    public void clickLoginButtonTwice() {
        int random = 123;
        loginButton.click();
        //4353454/
        //$(String.format(newEmailLink, 123)).click();
    }
//
//    public static void main(String[] args) {
//        System.out.println(String.format("Hi %s im %d yo", "Artem", 4523));
//    }
//
//    public void doXXX() {
//        //....
//        loginButton2.click();
//        //...
//    }

//    public void clickNewEmailLink() {
//        $(newEmailLink).click();
//    }

}
