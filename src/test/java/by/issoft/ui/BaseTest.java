package by.issoft.ui;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    // common service shit

    @BeforeSuite
    public void globalBefore() {
        // -db dump-
        // -100 api calls-
    }

    @AfterSuite
    public void globalAfter() {

    }

    public Object getData(String testId){
        return null;
    }
    public Object getData(String testId, String fileName, Class cls, Object otherOptions){
        // go to file/db/api
        // read
        // return object/list/map
        return null;
    }

}
