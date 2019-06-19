package pageobject;

import context.Context;
import org.openqa.selenium.*;

public class MainPage extends Context {
    private By searchField = By.name("q");
    private By searchBtn = By.name("btnK");
    //private By searchBtnEnter = By.linkText("https://accounts.google.com/ServiceLogin?hl=ru&passive=true&continue=https://www.google.com/%3Fgws_rd%3Dssl");

    public By getSearchField(){return searchField;}
    public By getSearchBtn(){return searchBtn;}

    public void search(final String inputSearch){
        System.out.println("Searching by string value: " + inputSearch);
        Context.initDriver().findElement(getSearchField()).clear();
        Context.initDriver().findElement(getSearchField()).sendKeys(inputSearch);
        Context.initDriver().findElement(getSearchField()).sendKeys(Keys.ENTER);
    }

    public void search(final int inputSearch){
        System.out.println("Searching by string value: " + inputSearch);
        Context.initDriver().findElement(getSearchField()).clear();
        Context.initDriver().findElement(getSearchField()).sendKeys(String.valueOf(inputSearch));
        Context.initDriver().findElement(getSearchField()).sendKeys(Keys.ENTER);
    }

    public void checkB(){
        System.out.println("Checking button");
        Context.initDriver().findElement(getSearchBtn()).isDisplayed();
    }

    public void checkS(final String inputSearch){
        System.out.println("Searching by string value: " + inputSearch);
        Context.initDriver().findElement(getSearchField()).sendKeys(inputSearch);
    }

    public String checkS2(){
        return Context.initDriver().findElement(getSearchField()).getAttribute("value");
    }
}