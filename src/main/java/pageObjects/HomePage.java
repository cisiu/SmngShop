package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.How;

public class HomePage {
    @CacheLookup
    @FindBy(partialLinkText="SMARTFONY")
    public WebElement menu_smartfony;
    @CacheLookup
    @FindBy(partialLinkText="TABLETY")
    public WebElement menu_tablety;
    @CacheLookup
    @FindBy(partialLinkText="AKCESORIA")
    public WebElement menu_akcesoria;
    @CacheLookup
    @FindBy(partialLinkText="TELEWIZORY")
    public WebElement menu_telewizory;
    @CacheLookup
    @FindBy(partialLinkText="AUDIO WIDEO")
    public WebElement menu_audio_wideo;

//    public HomePage(WebElement menu_statistic) {
//        instanceCountOfHomePage=+1;

}
