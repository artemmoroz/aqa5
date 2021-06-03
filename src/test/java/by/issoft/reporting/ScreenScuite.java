package by.issoft.reporting;

import lombok.Data;
import lombok.experimental.Accessors;
import org.testng.ISuite;
import org.testng.ISuiteListener;

public class ScreenScuite implements ISuiteListener {
    @Override
    public void onStart(ISuite suite) {
       // ScreenShooter.captureSuccessfulTests = true;
    }

    @Override
    public void onFinish(ISuite suite) {

    }
}
