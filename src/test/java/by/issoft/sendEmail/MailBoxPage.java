package by.issoft.sendEmail;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MailBoxPage {
    String inboxLink = ".mail-Layout-Inner a[href=\"#inbox\"]";
    String refreshButton = ".mail-ComposeButton-Refresh";
    String emailSubject = ".mail-MessageSnippet-Item_content-row span span span:nth-child(1) span";
    ElementsCollection emailSubjects = $$(".mail-MessageSnippet-Item_content-row span span span:nth-child(1) span");

    public void clickRefreshButton(){
        $(refreshButton).click();
    }

    public void clickInboxLink(){
        $(inboxLink).click();
    }

    public ElementsCollection getEmailSubjects(){
        ElementsCollection elements = $$(emailSubject);
        return elements;
    }

}
