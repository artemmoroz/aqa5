package by.issoft.edostavka;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class PriceTest {


    @Test
    public void coffeePriceTest(){

        Configuration.pageLoadTimeout = 120000;
        open("https://e-dostavka.by/");

        $("#main_menu__search > a").click();

        $x("//input[@id='searchtext']")
                .setValue("«Lavazza» Qualita Oro, 250")
                .pressEnter();

        //$x("//a[contains(text(),'Кофе молотый «Lavazza» Qualita Oro, 250')]").click();

        ElementsCollection elements = $$(".title a.fancy_ajax");

        //SelenideElement ss = elements.get(2);

        for(SelenideElement e: elements){
            if(e.getText().contains("Кофе молотый «Lavazza» Qualita Oro, 250")){
                //ok
                e.click();
                String price = $(".description li:nth-child(5) span").getText();
                Assert.assertEquals(price, "51.96", "incorrect price");
                break;
            }
        }

    }

}
