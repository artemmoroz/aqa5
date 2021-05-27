package by.issoft.sendEmail;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class NewEmailPopUp {
    String toField = ".ComposeRecipients-TopRow .MultipleAddressesDesktop-Field div";
    String subjectField = ".compose-LabelRow input";
    String bodyTextArea = "#cke_1_contents div";
    String sendButton = ".composeReact__footer .ComposeControlPanel-Part:nth-child(1) > div:nth-child(1 ) button";

    public void sendEmail(String email, String subject, String body){
        $(toField).setValue(email);
        $(subjectField).setValue(subject);
        $(bodyTextArea).setValue(body);
        $(sendButton).click();
    }
}
