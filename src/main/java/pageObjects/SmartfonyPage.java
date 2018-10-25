package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartfonyPage {
    final WebDriver driver;

    @FindBy(xpath="//*[@data-show=\"Pokaż filtry<i></i>\"]")
    public WebElement filterToggle;
    @FindBy(xpath="(//*[contains(text(),\"Wyników na stronie\")]//*[contains(text(), \"▾\")])[1]")
    public WebElement wynikNaStronie;
    @FindBy(xpath="//div[@class=\"selectric\"]/p[contains(text(), \"Sortuj\")]")
    public WebElement Sortuj;
    @FindBy(xpath="(//i[contains(@class, \"icon-arrow-right05\")])[1]")
    public WebElement showMoreResults;

    public SmartfonyPage(WebDriver driver) {
        this.driver = driver;
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.menu_smartfony.click();

    }


}
