package driverInstantiation;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DriverForSmngShopWork {
    public WebDriver driver;
    private ChromeOptions options = new ChromeOptions();
    public DriverForSmngShopWork() throws MalformedURLException {
//        WebDriver driver;
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        capability.setPlatform(Platform.WINDOWS);

        options.addArguments("--user-data-dir=C:\\chrome-dev-profile\\");
//        options.addArguments("user-data-dir=C:\\Users\\k.cisek\\AppData\\Local\\Google\\Chrome\\User Data");
        options.addArguments("disable-popup-blocking");
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://sklepsamsung.pl");
    }
}

