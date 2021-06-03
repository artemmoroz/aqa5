package by.issoft.reporting;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import lombok.Data;
import lombok.experimental.Accessors;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;

public class AllureScreenListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        screen();
    }

    @Attachment(value = "Page success screenshot", type = "image/png")//2
    public byte[] screen(){
        byte[] screenshot = Selenide.screenshot(OutputType.BYTES);
        return screenshot;
    }


    @Override
    public void onTestFailure(ITestResult result) {
        byte[] screenshot = Selenide.screenshot(OutputType.BYTES);
        Allure.addAttachment("Page screenshot"+result.getName(), new ByteArrayInputStream(screenshot));//1
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }


//    @Override
//    public void onTestFailure(ITestResult result) {
//        //
//        System.out.println("im failed "+result.getName());
//        saveScreenshot();
//    }
//
//
//    @Attachment(value = "Page screenshot", type = "image/png")
//    public byte[] saveScreenshot() {
//        return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
//    }

}
