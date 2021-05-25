package by.issoft.yandex;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

import static com.codeborne.selenide.Selenide.*;


public class OlgaYandexMail2{

    @Test
    public void email3() throws InterruptedException {

        YandexSearchPage searchPage = new YandexSearchPage();

        searchPage.doSearch("xxxx");
        searchPage.doSearch2("xxxx");
        searchPage.doSearch3("xxxx");
        searchPage.doSearch4("xxxx");

        Assert.assertTrue(searchPage.getEmailState("vvv"));
    }

    @Test
    public void emailCancel4() throws InterruptedException {
        YandexSearchPage searchPage = new YandexSearchPage();

        searchPage.doSearch("yyyy");


    }
}

