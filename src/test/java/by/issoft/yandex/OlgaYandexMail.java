package by.issoft.yandex;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

import static com.codeborne.selenide.Selenide.*;


public class OlgaYandexMail {


    String loginInput = "passp-field-login";

    @BeforeMethod
    public void login(){
        open("https://passport.yandex.by/");
        $(By.id(loginInput)).setValue("test000.automation").pressEnter();
        $(By.id("passp-field-passwd")).setValue("Testing&2021").pressEnter();
        $(By.cssSelector("span.user-account__name")).click();
    }

    public void sendEmail(String email, String subject){
        $(By.cssSelector("div.MultipleAddressesDesktop-Field div.composeYabbles")).setValue("test000.automation@yandex.ru");
        int generatedNumber = new Random().nextInt() % 10000;
        $(By.cssSelector("input.composeTextField.ComposeSubject-TextField")).setValue("test" + generatedNumber);
        $(By.cssSelector("div.ComposeMbodyCKEditor.composeReact__message-body")).click();
        $(By.cssSelector("#cke_1_contents div")).setValue("testing email sending" + generatedNumber);

    }

    @Test
    public void email() throws InterruptedException {

        $(By.cssSelector("li.menu__list-item")).click();
        $(By.cssSelector("span.mail-ComposeButton-Text")).click();
        sendEmail("dsfsdg", "|dgfdsgd");
        $(By.cssSelector("button.ComposeControlPanelButton-Button_action")).click();
        $(By.cssSelector(".mail-Layout-Inner a[href=\"#sent\"]"))
                .click();
        //Selenide.sleep(1500);
        ElementsCollection elements = $$("span.mail-MessageSnippet-Item_subject");
        for (SelenideElement e : elements) {
            String s = e.getText();
            if (s.equals("test" + 1)) {
                break;
            }
        }
    }

    @Test
    public void emailCancel() throws InterruptedException {
        $(By.cssSelector("li.menu__list-item")).click();
        $(By.cssSelector("span.mail-ComposeButton-Text")).click();
        sendEmail("dsfsdg", "|dgfdsgd");
        $(By.cssSelector("button.ComposeControlPanelButton-Button_action Cancel")).click();
        //assert

    }
}

