package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.How;

public class HomePage {
//    @CacheLookup
//    @FindBy(partialLinkText="SMARTFONY")
//    /html/body/div[4]/header/div[2]/div/nav/ul/li[1]/a

//    @CacheLookup
    @FindBy(xpath="/html/body/div[4]/header/div[2]/div/nav/ul/li[1]/a")
    public WebElement menu_smartfony;
//    @CacheLookup
    @FindBy(linkText = "TABLETY")
    public WebElement menu_tablety;
//    @CacheLookup
    @FindBy(xpath="/html/body/div[4]/header/div[2]/div/nav/ul/li[3]/span")
    public WebElement menu_akcesoria;
//    @CacheLookup
    @FindBy(linkText="TELEWIZORY")
    public WebElement menu_telewizory;
//    @CacheLookup
    @FindBy(xpath="/html/body/div[4]/header/div[2]/div/nav/ul/li[5]/span")
    public WebElement menu_audio_wideo;
    @FindBy(xpath="/html/body/div[4]/header/div[2]/div/nav/ul/li[5]/span")
    public WebElement menu_agd;
    @FindBy(xpath = "/html/body/div[4]/header/div[2]/div/nav/ul/li[5]/span")
    public WebElement menu_sprzet_it;


//    public HomePage(WebElement menu_statistic) {
//        instanceCountOfHomePage=+1;

}
