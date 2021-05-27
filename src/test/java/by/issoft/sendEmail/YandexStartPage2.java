package by.issoft.sendEmail;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Data
public class YandexStartPage2 {

    String url;

    public YandexStartPage2(String url) {
        this.url = url;
    }

    public void open(){
        //
    }

    public int getCurretnTemp(){
        $("cvsdg").getText();
        return 0;
    }

    public MailBoxPage login(){
        $("l").click();
        return new MailBoxPage();
    }
}
