package by.issoft.testng;

import lombok.Data;
import lombok.experimental.Accessors;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class SampleListener  implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("taking screen");
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("im starting");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Finish");
    }
}
