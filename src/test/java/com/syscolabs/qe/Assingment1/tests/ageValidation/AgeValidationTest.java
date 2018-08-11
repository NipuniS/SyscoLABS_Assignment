package com.syscolabs.qe.Assingment1.tests.ageValidation;

import com.syscolab.qe.core.reporting.SyscoLabListener;
import com.syscolabs.qe.Assingment1.functions.ageValidation.AgeValidation;
import com.syscolabs.qe.Assingment1.functions.common.MainHeader;
import com.syscolabs.qe.Assingment1.types.messages.AgeValidationMessage;
import com.syscolabs.qe.Assingment1.utils.TestBase;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
/**
 * Created by nipuniS on 8/5/18.
 */

@Listeners(SyscoLabListener.class)
public class AgeValidationTest extends TestBase {

    @BeforeClass
    public void init(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Bundabergrum - Checkout");
    }

    @AfterClass
    public void afterClass() {
        AgeValidation.quiteDriver();
    }


    @Test(description = "web-0001", alwaysRun = true)
    public void testAgeValidationPageNavigation() throws InterruptedException {
        softAssert = new SoftAssert();

        AgeValidation.navigateToUrl();
        Thread.sleep(5000);
        softAssert.assertTrue(AgeValidation.isCheckBoxDisplayed(), "Check box shouldn't not to be displayed.");
        softAssert.assertTrue(AgeValidation.isCheckBoxClickable(), "Check box shouldn't unable to click.");
        softAssert.assertTrue(AgeValidation.isEnterButtonDisplayed(), "Enter Button shouldn't not to be displayed.");
        softAssert.assertTrue(AgeValidation.isEnterButtonClickable(), "Enter Button shouldn't not to be displayed.");
        softAssert.assertAll();

    }

    @Test(description = "wed-0002", dependsOnMethods = "testAgeValidationPageNavigation", alwaysRun = true)
    public void testLoginWithOutBirthDay() {
        softAssert = new SoftAssert();

        AgeValidation.clickbtnEnter();
        softAssert.assertEquals(AgeValidation.getAgeMissignMessage(), AgeValidationMessage.ENTER_WITHOUT_BIRTHDAY_MESSAGE);

        softAssert.assertAll();
    }

    @Test(description = "web-0003", dependsOnMethods = "testLoginWithOutBirthDay", alwaysRun = true)
    public void testLoginWithInvalidAge() {
        softAssert = new SoftAssert();

        AgeValidation.setDate();
        AgeValidation.setMonth();
        AgeValidation.setInvalidYear();
        AgeValidation.clickbtnEnter();
        softAssert.assertEquals(AgeValidation.getAgeMissignMessage(), AgeValidationMessage.INVALID_LOGIN_MESSAGE);

        softAssert.assertAll();
    }

    @Test(description = "web-0004", dependsOnMethods = "testLoginWithInvalidAge", alwaysRun = true)
    public void testLoginWithValidAge() {
        softAssert = new SoftAssert();

        AgeValidation.setDate();
        AgeValidation.setMonth();
        AgeValidation.setValidYear();
        AgeValidation.clickbtnEnter();
        softAssert.assertTrue(MainHeader.isMyAccountIconDisplayed(), "Valid User should not be unable to login to site.");

        softAssert.assertAll();
    }

    @Test(description = "web-0005", dependsOnMethods = "testLoginWithValidAge", alwaysRun = true)
    public void testHomePageFeatures() {
        softAssert = new SoftAssert();

        // softAssert.assertTrue(MainMenu.isLinkToHomeDisplayed(), "Valid User should not be unable to login to site.");
        // softAssert.assertTrue(MainHeader.isHelpMessageContentDisplayed(), "Link for help message content should be appeared in the left conner in header");
        //  softAssert.assertTrue(MainHeader.isMyAccountIconDisplayed(), "Link for My account should be appeared in the right conner in header");
        // softAssert.assertTrue(MainHeader.isWishListIconDisplayed(), "Link for Wish List should be appeared in the right conner in header");
        //  softAssert.assertTrue(MainHeader.isCartIconDisplayed(), "Link for cart should be appeared in the right conner in header");

        softAssert.assertAll();
    }


}
