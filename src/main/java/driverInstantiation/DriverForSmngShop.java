package driverInstantiation;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverForSmngShop {
    public WebDriver driver;
    ChromeOptions options = new ChromeOptions();
    public DriverForSmngShop() throws MalformedURLException {
//        WebDriver driver;
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setPlatform(Platform.WIN10);
        options.addArguments("user-data-dir=C:/Users/Cisu/AppData/Local/Google/Chrome/User Data/Default");
        options.addArguments("enable-popup-blocking");
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://sklepsamsung.pl");
    }
}

