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
//import pageObjects.HomePage;
//import pageObjects.settingsPage.SettingsPage;
//import pageObjects.LogWindow;
//import pageObjects.settingsPage.SettingsPageWlan;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class test01 {

    DriverForSmngShopWork driverForSmngShop;
    HomePage homePage;
    AgreementPage agreementPage;

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {

        driverForSmngShop = new DriverForSmngShopWork();
    }

    @Test
    public void test() throws InterruptedException {

        agreementPage = PageFactory.initElements(driverForSmngShop.driver, AgreementPage.class);
        System.out.println("agreement instance");
        agreementPage.agreementAction();
        System.out.println("klikniete");

        homePage = PageFactory.initElements(driverForSmngShop.driver, HomePage.class);
        System.out.println("czekamy na zgode");

        homePage.menu_smartfony.click();
        homePage.menu_tablety.click();
        homePage.menu_telewizory.click();
        homePage.menu_audio_wideo.click();
        homePage.menu_agd.click();
        homePage.menu_sprzet_it.click();
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        driverForSmngShop.driver.quit();
    }
}


