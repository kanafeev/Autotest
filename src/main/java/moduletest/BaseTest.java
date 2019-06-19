package moduletest;

import context.Context;
import org.testng.annotations.*;
import testcase.CheckBtn;
import testcase.CheckSrchField;
import testcase.SearchingTest;

public class BaseTest extends Context{

    @BeforeTest
    public void init(){
        Context.runBrowser("https://www.google.com/");
    }


    @Test
    public void checkSearchingEngine() {
        SearchingTest.execute("comaqa");
    }
    @Test
    public void checkBtnEngine(){
        CheckBtn.execute();
    }
    @Test
    public void checkFieldEngine(){
        CheckSrchField.execute("Test");
    }

    @AfterTest
    public static void close(){
        Context.close();
    }
}