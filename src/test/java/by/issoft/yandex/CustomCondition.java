package by.issoft.yandex;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Driver;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import lombok.experimental.Accessors;
import org.openqa.selenium.WebElement;

import javax.annotation.ParametersAreNonnullByDefault;


public class CustomCondition {//extends Condition {
//        private final String attributeName;
//
//        public CustomCondition(String attributeName) {
//            super("attribute");
//            this.attributeName = attributeName;
//        }
//
//        public boolean apply(Driver driver, WebElement element) {
//            boolean searchSubjectResult = false;
//            for (SelenideElement e : elements) {
//                String s = e.getText();
//                //Assert.assertEquals(s, subject, "email subject not exists");
//                if (s.equals(subject)) {
//                    //break;
//                    searchSubjectResult = true;
////                Assert.assertEquals(s, subject, "email subject not exists");
//                }
//            }
//            return searchSubjectResult;
//        }
//
//        public String toString() {
//            return this.getName() + " " + this.attributeName;
//        }
//    }
}
