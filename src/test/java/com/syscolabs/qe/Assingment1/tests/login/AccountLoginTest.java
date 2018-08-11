package com.syscolabs.qe.Assingment1.tests.login;

import com.syscolab.qe.core.reporting.SyscoLabListener;
import com.syscolabs.qe.Assingment1.functions.ageValidation.AgeValidation;
import com.syscolabs.qe.Assingment1.functions.common.MainHeader;
import com.syscolabs.qe.Assingment1.functions.login.AccountLogin;
import com.syscolabs.qe.Assingment1.pages.login.AccountLoginPage;
import com.syscolabs.qe.Assingment1.types.messages.LoginMessage;
import com.syscolabs.qe.Assingment1.types.testData.LoginTestData;
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
public class AccountLoginTest extends TestBase {

    @BeforeClass
    public void init(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Bundabergrum - Checkout");
        AgeValidation.navigateToUrl();
        AgeValidation.validateAge();
    }

    @AfterClass
    public void afterClass() {
        AgeValidation.quiteDriver();
    }

    @Test(description = "web-0006", alwaysRun = true)
    public void testMyAccountPageNavigation() throws InterruptedException {
        softAssert = new SoftAssert();

        AgeValidation.validateAge();
        Thread.sleep(5000);
        softAssert.assertTrue(AccountLogin.IsLoginButtonDisplayed(), "Enter Button shouldn't not to be displayed.");
        softAssert.assertAll();

    }


    @Test(description = "web-0007",dependsOnMethods = "testMyAccountPageNavigation", alwaysRun = true)
    public void testLoginPageNavigation() throws InterruptedException {
        softAssert = new SoftAssert();

        MainHeader.navigateToMyAccount();
        Thread.sleep(100);
        softAssert.assertTrue(AccountLogin.IsLoginButtonDisplayed(), "Account login page should not to be not displayed");
        Thread.sleep(100);

        softAssert.assertAll();
    }

    @Test(description = "web-0008", dependsOnMethods = "testLoginPageNavigation", alwaysRun = true)
    public void testWithoutEmailPassWordLogin() throws InterruptedException {
        softAssert = new SoftAssert();

        AccountLogin.clickLogin();
        Thread.sleep(100);
        softAssert.assertEquals(AccountLogin.getEmptyEmailVerification(),LoginMessage.EMPTY_EMAIL_PASSWORD_MESSAGE);
        Thread.sleep(100);
        softAssert.assertEquals(AccountLogin.getEmptyPassWordVerification(),LoginMessage.EMPTY_EMAIL_PASSWORD_MESSAGE);
        Thread.sleep(100);

        softAssert.assertAll();
    }

    @Test(description = "web-0009", dependsOnMethods = "testWithoutEmailPassWordLogin", alwaysRun = true)
    public void testInvalidEmailPassWordLogin() throws InterruptedException {
        softAssert = new SoftAssert();

        AccountLogin.enterEmail(LoginTestData.INVALID_EMAILL);
        Thread.sleep(100);
        AccountLogin.enterPassword(LoginTestData.INVALID_PASSWORD);
        Thread.sleep(100);
        AccountLogin.clickLogin();
        Thread.sleep(100);
        softAssert.assertEquals(AccountLogin.getEmailVerification(), LoginMessage.INVAID_EMAIL_MESSAGE);
        Thread.sleep(100);
        softAssert.assertEquals(AccountLogin.getPasswordVerification(), LoginMessage.INCORRECT_PASSWORD_MESSAGE);
        Thread.sleep(100);

        softAssert.assertAll();
    }

    @Test(description = "web-0010", dependsOnMethods = "testInvalidEmailPassWordLogin", alwaysRun = true)
    public void testInvalidEmailLogin() throws InterruptedException {
        softAssert = new SoftAssert();

        AccountLogin.enterEmail(LoginTestData.INVALID_EMAILL);
        Thread.sleep(1000);
        AccountLogin.enterPassword(LoginTestData.VALID_PASSWORD);
        Thread.sleep(1000);
        AccountLogin.clickLogin();
        Thread.sleep(1000);
        softAssert.assertEquals(AccountLogin.getEmailVerification(), LoginMessage.INVAID_EMAIL_MESSAGE);
        Thread.sleep(1000);

        softAssert.assertAll();
    }

    @Test(description = "web-0011", dependsOnMethods = "testInvalidEmailLogin", alwaysRun = true)
    public void testInvalidPasswordLogin() throws InterruptedException {
        softAssert = new SoftAssert();

        AccountLogin.enterEmail(LoginTestData.VALID_EMAILL);
        Thread.sleep(1000);
        AccountLogin.enterPassword(LoginTestData.INVALID_PASSWORD);
        Thread.sleep(1000);
        AccountLogin.clickLogin();
        Thread.sleep(1000);
        softAssert.assertEquals(AccountLogin.getPasswordVerification(), LoginMessage.INCORRECT_PASSWORD_MESSAGE);
        Thread.sleep(1000);

        softAssert.assertAll();
    }

    @Test(description = "web-0012", dependsOnMethods = "testInvalidPasswordLogin", alwaysRun = true)
    public void testValidEmailPasswordLogin() throws InterruptedException {
        softAssert = new SoftAssert();

        AccountLogin.enterEmail(LoginTestData.VALID_EMAILL);
        Thread.sleep(100);
        AccountLogin.enterPassword(LoginTestData.VALID_PASSWORD);
        Thread.sleep(100);
        AccountLogin.clickLogin();
        Thread.sleep(100);
        softAssert.assertEquals(AccountLogin.getWelcomeMessage(), LoginMessage.WELCOME_MESSAGE);
        Thread.sleep(100);

        softAssert.assertAll();
    }
}

