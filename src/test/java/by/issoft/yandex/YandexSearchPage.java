package by.issoft.yandex;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import lombok.experimental.Accessors;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;

@Data
@Accessors(chain = true)
public class YandexSearchPage {

    SelenideElement searchInput = $("fgsdfhsdf hfdh srh h ");
    SelenideElement searchButton = $("");
    SelenideElement voiceInput = $("");


    public void doSearch(String searchString){
        searchInput.setValue(searchString);
        searchButton.click();
    }

    public boolean getEmailState(String name){
        //....

    }

    public void validateEmailSent2(String name){
        //....
        Assert.assertTrue(true);
    }
}
