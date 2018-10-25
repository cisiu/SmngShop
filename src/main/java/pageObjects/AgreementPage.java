package pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AgreementPage {


    @FindBy(xpath="//*[@id=\"js-webpushModal_content\"]/div/button[2]")
    public WebElement zgoda_pop_up;

    private final static Logger LOGGER = Logger.getLogger(AgreementPage.class .getName());

    public void agreementAction(){
        try {
            TimeUnit.SECONDS.sleep(3);
            zgoda_pop_up.click();
        }
        catch (Exception e){
//            LOGGER.log(Level.SEVERE,"exception trying logging", e.getStackTrace());
//            LOGGER.log(Level.SEVERE, e.getMessage(), e);
            LOGGER.log(Level.INFO, "There was no agreement");
        }
    }

}