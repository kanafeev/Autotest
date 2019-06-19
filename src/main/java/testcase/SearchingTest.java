package testcase;

import org.testng.Assert;
import pageobject.MainPage;
import utils.ParsingPage;

import java.util.List;

public class SearchingTest  {
    public static void execute(String expectedRes) {
        Boolean result = false;
        MainPage mainPage = new MainPage();
        ParsingPage parsingPage = new ParsingPage();
        System.out.println("In this test we're checking search field");

        mainPage.search(expectedRes);
        List<String> textTest = parsingPage.readSearchResults();
        for (String value : textTest)
        { System.out.println(value);
          if (value.contains(expectedRes)){
              result = true;
              break;
          }
        }
        Assert.assertTrue(result == true);
    }
}
