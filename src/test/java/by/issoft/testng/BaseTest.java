package by.issoft.testng;

import by.issoft.reporting.AllureScreenListener;
import lombok.Data;
import lombok.experimental.Accessors;
import org.testng.annotations.Listeners;

@Listeners({SampleListener.class, AllureScreenListener.class})
public class BaseTest {


}
