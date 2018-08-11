package com.syscolabs.qe.Assingment1.tests.cart;

import com.syscolab.qe.core.reporting.SyscoLabListener;
import com.syscolabs.qe.Assingment1.functions.ageValidation.AgeValidation;
import com.syscolabs.qe.Assingment1.functions.cart.Cart;
import com.syscolabs.qe.Assingment1.functions.common.MainHeader;
import com.syscolabs.qe.Assingment1.functions.login.AccountLogin;
import com.syscolabs.qe.Assingment1.types.messages.CartMessage;
import com.syscolabs.qe.Assingment1.types.testData.CartTestData;
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
public class CartFunctionTest extends TestBase {

    @BeforeClass
    public void init(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Bundabergrum - Checkout");
        AgeValidation.navigateToUrl();
        AgeValidation.validateAge();
        MainHeader.navigateToMyAccount();
        AccountLogin.enterEmail(LoginTestData.VALID_EMAILL);
        AccountLogin.enterPassword(LoginTestData.VALID_PASSWORD);
        AccountLogin.clickLogin();
    }

    @AfterClass
    public void afterClass() {
        AgeValidation.quiteDriver();
    }


    @Test(description = "web-0013", alwaysRun = true)
    public void testRemoveCartItem() throws Exception{
        SoftAssert softAssert = new SoftAssert();

        MainHeader.navigateToCart();
        Cart.clickRemoveLink();
        MainHeader.navigateToCart();
        softAssert.assertEquals(Cart.isDisplayedZeroInCart(), CartTestData.NO_ITEM,"Expected value does not displayed");

        softAssert.assertAll();
    }

    @Test(description = "web-0014", dependsOnMethods = "testRemoveCartItem", alwaysRun = true)
    public static void testAddCartItem() {
        SoftAssert softAssert = new SoftAssert();

        Cart.MoveToProductCategory();
        Cart.clickRoyalLiqueur();
        Cart.clickAnItem();
        Cart.clickAddToCartButton();
        softAssert.assertTrue(Cart.isDisplayedPriceInPopUp(), "expected price does not displayed");
        softAssert.assertTrue(Cart.isDisplayedNameInPopUP(), "expected name does not displayed");

        softAssert.assertAll();
    }

    @Test(description = "web-0015",dependsOnMethods = "testAddCartItem", alwaysRun = true)
    public static void testCheckOutItem() {
        SoftAssert softAssert = new SoftAssert();

        Cart.clickCheckOut();
        softAssert.assertEquals(Cart.isDisplayedOneInShoppingCart(), "1", "Expected value does not displayed");
        softAssert.assertTrue(Cart.isDisplayedPrice(), "expected price does not displayed");
        softAssert.assertTrue(Cart.isDisplayedName(), "expected name does not displayed");

        softAssert.assertAll();
    }

    @Test(description = "web-0016",dependsOnMethods = "testCheckOutItem", alwaysRun = true)
    public static void testCheckOutVerification() {
        SoftAssert softAssert = new SoftAssert();

        Cart.clickProceedToCheckOut();
        softAssert.assertEquals(Cart.isDisplayedFirstName(),LoginTestData.USER_FIRST_NAME,"expected name does not displayed");
        softAssert.assertEquals(Cart.isDisplayedLastName(),LoginTestData.USER_LAST_NAME,"expected name does not displayed");
        Cart.clearFirstName();
        Cart.clearLastNameName();
        Cart.clearAddress1();
        Cart.clearContactNumberName();
        Cart.clickContinue();
        softAssert.assertEquals(Cart.isDisplayedEmptyErrorFirstName(), CartMessage.CART_EMPTY_FIELD_MESSAGE,"expected value does not displayed");
        softAssert.assertEquals(Cart.isDisplayedEmptyErrorLastName(),CartMessage.CART_EMPTY_FIELD_MESSAGE,"expected value does not displayed");
        softAssert.assertEquals(Cart.isDisplayedEmptyErrorAddress(),CartMessage.CART_EMPTY_FIELD_MESSAGE,"expected value does not displayed");
        softAssert.assertEquals(Cart.isDisplayedEmptyErrorContactNumber(),CartMessage.CART_EMPTY_FIELD_MESSAGE,"expected value does not displayed");

        softAssert.assertAll();
    }
    @Test(description = "web-0017",dependsOnMethods = "testCheckOutVerification", alwaysRun = true)
    public static void testContinueInProceedToCheckOut() {
        SoftAssert softAssert=new SoftAssert();

        Cart.enterFirstName(LoginTestData.USER_FIRST_NAME);
        Cart.enterLastName(LoginTestData.USER_LAST_NAME);
        Cart.enterAddress1(LoginTestData.USER_ADDRESS);
        Cart.enterContactNumber(LoginTestData.USER_CONTACT);
        softAssert.assertEquals(Cart.isDisplayedFirstName(),LoginTestData.USER_FIRST_NAME,"expected name does not displayed");
        softAssert.assertEquals(Cart.isDisplayedLastName(),LoginTestData.USER_LAST_NAME,"expected name does not displayed");
        softAssert.assertEquals(Cart.isDisplayedAddress(),LoginTestData.USER_ADDRESS,"expected name does not displayed");
        softAssert.assertEquals(Cart.isDisplayedContactNumber(),LoginTestData.USER_CONTACT,"expected name does not displayed");
        Cart.removePostCode();
        Cart.enterPostCode("2000");
        Cart.clickContinue();
        softAssert.assertEquals(Cart.isDisplayedDeliveryOptions(),"DELIVERY OPTIONS","expected name does not displayed");

        softAssert.assertAll();
    }


    @Test(description = "web-0018",dependsOnMethods = "testContinueInProceedToCheckOut", alwaysRun = true)
    public static void testDeliveryOptions() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();

        Cart.clickContinueInDeliveryOptions();
        Cart.selectPayPalOption();
        Cart.selectAgreement();
        Cart.clickPurchase();
        Thread.sleep(1000);
        softAssert.assertEquals(Cart.isDisplayedPayPalAccount(),"PayPal Guest Checkout","expected name does not displayed");

        softAssert.assertAll();
    }

}
