package uk.gov.harrow.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.testbase.TestBase;

public class Testcase extends TestBase {

    HomePage homePage;


    @BeforeMethod(groups = {"Regression","Smoke","Sanity"})
    public void setUp() {
        homePage = new HomePage();

    }

    @Test(groups = {"Regression","Smoke","Sanity"})
    public void verifyClickOnLoginOrRegisterLink() {
        //click on login or register link
        homePage.clickOnLoginOrRegisterLink();

    }

    @Test (groups = {"Regression","Smoke"})
    public void verifyClickOnServicesBtn() {
        //click on services button
       // homePage.clickOnServicesBtn();
    }

//    @Test (groups = {"Regression"})
//    public void verifyElementsOnHarrowWebsiteHomePageAreDisplayed() {
//        //verify service button is displayed
//       // homePage.isDisplayedServicesBtn();
//    }


}
