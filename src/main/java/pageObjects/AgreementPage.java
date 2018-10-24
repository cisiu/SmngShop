package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;


import java.util.logging.Level;
import java.util.logging.Logger;


public class AgreementWindow {


    @FindBy(xpath="//*[@id=\"js-webpushModal_content\"]/div/button[2]")
    public WebElement zgoda_pop_up;

    private final static Logger LOGGER = Logger.getLogger(AgreementWindow.class .getName());

    public void agreeementAction(){
        try {
            zgoda_pop_up.click();
        }
        catch (Exception e){
//            LOGGER.log(Level.SEVERE,"exception trying logging", e.getStackTrace());
//            LOGGER.log(Level.SEVERE, e.getMessage(), e);
            LOGGER.log(Level.INFO, "There was no agreement");
        }
    }

}