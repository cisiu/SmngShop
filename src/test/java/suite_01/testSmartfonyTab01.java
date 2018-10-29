package suite_01;
//import com.cisu.pageObjects.HomePage;
//import com.cisu.pageObjects.LogWindow;
//import com.cisu.pageObjects.SmsPage;
import driverInstantiation.DriverForSmngShopWork;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.AgreementPage;
import pageObjects.HomePage;
import pageObjects.SmartfonyPage;
//import pageObjects.HomePage;
//import pageObjects.settingsPage.SettingsPage;
//import pageObjects.LogWindow;
//import pageObjects.settingsPage.SettingsPageWlan;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class testSmartfonyTab01 {

    DriverForSmngShopWork driverForSmngShop;
    HomePage homePage;
    AgreementPage agreementPage;

    private final static Logger LOGGER = Logger.getLogger(testSmartfonyTab01.class .getName());

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {

        driverForSmngShop = new DriverForSmngShopWork();
        LOGGER.log(Level.INFO, "driver created");
    }

    @Test
    public void test() throws InterruptedException {

        agreementPage = PageFactory.initElements(driverForSmngShop.driver, AgreementPage.class);
        System.out.println("agreement instance");
        agreementPage.agreementAction();
        System.out.println("klikniete");

        SmartfonyPage smartfonyPage = PageFactory.initElements(driverForSmngShop.driver, SmartfonyPage.class);
        System.out.println("czekamy na zgode");

        smartfonyPage.filterToggle.click();
        smartfonyPage.filterToggle.click();
        smartfonyPage.showMoreResults.click();
        smartfonyPage.Sortuj.click();
        smartfonyPage.wynikNaStronie.click();
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        driverForSmngShop.driver.quit();
    }
}


