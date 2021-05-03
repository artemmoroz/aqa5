package by.issoft.ui;

import com.codeborne.selenide.Condition;
import lombok.Data;
import lombok.experimental.Accessors;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

@Data
@Accessors(chain = true)
public class FirstUITest {

    @Test
    public void test1(){
        open("https://ya.ru/");
                    //".input_box"
        $("#text").setValue("Hello world");
//        $(By.cssSelector("#text"));
//        $(By.id("text"));
        $(".button_theme_websearch").click();


        $(By.xpath("//a[contains(@class, 'logo')]")).shouldBe(Condition.visible);
//        String logoText = $x("//a[contains(@class, 'logo')]").text();
//        Assert.assertEquals(logoText, "Yandex", "unvalid logo text");





    }
}
