package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.How;

public class homePage {

    @CacheLookup
    public WebElement menu_statistic;
    @CacheLookup
    public WebElement menu_index;
    @CacheLookup
    public WebElement menu_sms;
    @CacheLookup
    public WebElement menu_ussd;
    @CacheLookup
    public WebElement menu_update;
    @CacheLookup
    public WebElement menu_sharing;
    @CacheLookup
    public WebElement menu_settings;

//    public HomePage(WebElement menu_statistic) {
//        instanceCountOfHomePage=+1;

}
