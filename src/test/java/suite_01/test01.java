package suite_01;
//import com.cisu.pageObjects.HomePage;
//import com.cisu.pageObjects.LogWindow;
//import com.cisu.pageObjects.SmsPage;
import driverInstantiation.DriverForSmngShop;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import pageObjects.HomePage;
//import pageObjects.settingsPage.SettingsPage;
//import pageObjects.LogWindow;
//import pageObjects.settingsPage.SettingsPageWlan;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class test01 {

    DriverForSmngShop driverForSmngShop;
//    SettingsPageWlan settingsPageWlan;

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {

        driverForSmngShop = new DriverForSmngShop();
//        driverForSmngShop.driver.get("http://192.168.1.1");
    }

    @Test
    public void test() {

//        settingsPageWlan = PageFactory.initElements(driverForHuaweii.driver, SettingsPageWlan.class);
//        settingsPageWlan.clickWlanMacFilter();
//        settingsPageWlan.MacFilterFlag(2);
//        settingsPageWlan.insertMacadress("24:18:1D:37:A9:A3");
//        settingsPageWlan.applyChanges();
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
//        settingsPageWlan.clickWlanMacFilter();
//        settingsPageWlan.MacFilterFlag(0);
//        settingsPageWlan.applyChanges();
//        settingsPageWlan.insertMacadress("24:18:1D:37:A9:A3");
//        driverForSmngShop.driver.get("http://192.168.1.4");
//        TimeUnit.SECONDS.sleep(10);
        driverForSmngShop.driver.quit();
    }
}


