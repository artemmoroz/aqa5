package by.issoft.yandex;

import com.codeborne.selenide.*;
import lombok.Data;
import lombok.experimental.Accessors;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;
import java.util.Random;

import static com.codeborne.selenide.Selenide.*;

public class IraYandex {


    @Test
    public void sendEmailTest() {
//
//        Configuration.timeout = 0;
//        Configuration.pollingInterval = 0;
//        Configuration.pageLoadTimeout = 5;


        open("https://yandex.by/");
        //login
        $(By.cssSelector(".desk-notif-card__card >div> a:nth-child(1)")).click();
        $("#passp-field-login").setValue("autotest.java").pressEnter();
        $("#passp-field-passwd").setValue("zUtG8FZf3NnCvmB").pressEnter();
        //new email
        $(".desk-notif-card__toggled div:nth-of-type(1)").click();
        switchTo().window(1);
        $(".ComposeRecipients-TopRow .MultipleAddressesDesktop-Field div").setValue("autotest.java@yandex.com");

        Random random = new Random();
        String subject = "Test Subject1" + random;
        $(".compose-LabelRow input").setValue(subject);

        $("#cke_1_contents div").waitUntil(Condition.visible, 10);

        $("#cke_1_contents div").setValue(subject);
        $(".composeReact__footer .ComposeControlPanel-Part:nth-child(1) > div:nth-child(1 ) button").click();
        //check email

//        $(".mail-Layout-Inner a[href=\"#inbox\"]").click();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        $(".mail-ComposeButton-Refresh").click();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        ElementsCollection elements = $$(".mail-MessageSnippet-Item_content-row span span span:nth-child(1) span");
       // $(".mail-MessageSnippet").waitUntil(new CustomCondition(), 100);
        //1
//        boolean searchSubjectResult = false;
//        for (SelenideElement e : elements) {
//            String s = e.getText();
//            //Assert.assertEquals(s, subject, "email subject not exists");
//            if (s.equals(subject)) {
//                //break;
//                searchSubjectResult = true;
////                Assert.assertEquals(s, subject, "email subject not exists");
//            }
//        }
//        Assert.assertTrue(searchSubjectResult, "email subject not exists");


    }

}


