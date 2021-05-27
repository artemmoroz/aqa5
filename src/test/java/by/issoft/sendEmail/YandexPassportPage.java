package by.issoft.sendEmail;
import static com.codeborne.selenide.Selenide.*;

public class YandexPassportPage {

    String userNameField = "#passp-field-login";
    String passwordField = "#passp-field-passwd";

    public void enterUsernamePassword(String userName, String pwd){
        $(userNameField).setValue(userName).pressEnter();
        $(passwordField).setValue(pwd).pressEnter();
    }
}
