package uk.gov.harrow.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public static WebDriver driver;

    //constructor
    public BasePage(){
        //for log4j
        PropertyConfigurator.configure(System.getProperty("user.dir") +"/src/test/java/uk/gov/harrow/resorces/properties/log4j.properties");
        // for page factory
        PageFactory.initElements(driver,this);
    }
}
