package uk.gov.harrow.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.gov.harrow.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = Logger.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//span[@class='icon-fallback']")
    WebElement _loginOrRegisterLink;

    @FindBy(xpath = "//span[@class='button__text'][contains(text(),'Services')]")
    WebElement _servicesBtn;

    public void clickOnLoginOrRegisterLink() {
        Reporter.log(" Click on login or register link " + _loginOrRegisterLink.toString() + "<br>");
        clickOnElement(_loginOrRegisterLink);
        log.info(" Click on login or register link " + _loginOrRegisterLink.toString());
    }
    public void clickOnServicesBtn() {
        Reporter.log(" Click on service button "+ _servicesBtn.toString()+"<br>");
        clickOnElement(_servicesBtn);
        log.info(" Click on service button "+ _servicesBtn.toString());
    }


}
