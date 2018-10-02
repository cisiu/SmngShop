package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SmartfonyPage {
    final WebDriver driver;
    HomePage homePage;
    public SmartfonyPage(WebDriver driver) {
        this.driver = driver;
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
}
