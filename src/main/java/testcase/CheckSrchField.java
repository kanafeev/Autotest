package testcase;

import org.testng.Assert;
import pageobject.MainPage;

public class CheckSrchField {
    public static void execute(String expectedRes) {
        MainPage mainPage = new MainPage();
        System.out.println("In this test we're checking search field");
        mainPage.checkS(expectedRes);
        String actRes =  mainPage.checkS2();
        System.out.println(actRes);
        Assert.assertEquals(actRes, expectedRes);
    }
}
