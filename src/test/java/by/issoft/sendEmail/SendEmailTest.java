package by.issoft.sendEmail;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Random;

public class SendEmailTest {

    YandexStartPage yandexStartPage = new YandexStartPage();
    YandexPassportPage yandexPassportPage = new YandexPassportPage();

    @BeforeMethod
    public void yandexLogin(String un, String pwd){
        open("https://yandex.by/");
       // YandexStartPage yandexStartPage = new YandexStartPage();

        yandexStartPage.getLoginButton().pressEnter();

        //clickLoginButton();

        yandexPassportPage.enterUsernamePassword(un, pwd);
    }

    @BeforeMethod
    public void yandexLogin2(String un, String pwd){
        YandexStartPage2 yandexStartPage2 = new YandexStartPage2("xx");
        yandexStartPage2.open();
        MailBoxPage mailBoxPage = yandexStartPage2.login();
        mailBoxPage.clickRefreshButton();
    }
    @Test
    public void sendEmailTest(String un, String pwd){

     //   YandexStartPage yandexStartPage = new YandexStartPage();
        yandexStartPage.getNewEmailLink().click();
                //clickNewEmailLink();
        switchTo().window(1);
        NewEmailPopUp newEmailPopUp = new NewEmailPopUp();
        Random random = new Random();
        String subject = "Test Subject1" + String.valueOf(random);
        //newEmailPopUp.sendEmail(subject);
        MailBoxPage mailBoxPage = new MailBoxPage();
        mailBoxPage.clickInboxLink();
        Selenide.sleep(6000);
        mailBoxPage.clickRefreshButton();
        boolean result = false;
        for (SelenideElement e: mailBoxPage.getEmailSubjects()){
            String s = e.getText();
            if(s.equals(subject)){
                result = true;
            }
        }
        Assert.assertTrue(result);




    }
}
