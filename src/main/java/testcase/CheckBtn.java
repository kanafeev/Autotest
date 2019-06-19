package testcase;

import pageobject.MainPage;

public class CheckBtn {
    public static void execute(){
        MainPage mainPage = new MainPage();
        System.out.println("In this test we're checking search button");
        mainPage.checkB();
    }
}
