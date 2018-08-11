package com.syscolabs.qe.Assingment1.pages.common;

import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolabs.qe.Assingment1.pages.ageValidation.AgeValidationPage;
import com.syscolabs.qe.Assingment1.utils.PageBase;
import org.openqa.selenium.By;

/**
 * Created by nipuniS on 8/5/18.
 */
public class MainHeaderList extends PageBase {

    private By lnkMyAccount = By.xpath ("//*[@id=\"quick-access-list\"]/li[1]/ul/li[2]/ul/li/a");
    private By lnkWishList = By.xpath("//*[@id=\"quick-access-list\"]/li[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]");
    private By lnkCart = By.id("cartHeader");
    private By lnkHelpMessageContent = By.xpath("//*[@id=\"help-msg-content\"]/p[1]/span[1]");

    public void navigateToMyAccount() {
        syscoLabUIOgm.waitTillElementLoaded(lnkMyAccount);
        syscoLabUIOgm.sleep(10);
        syscoLabUIOgm.click(lnkMyAccount);
    }

    public void navigateToWishList() {
        syscoLabUIOgm.click(lnkWishList);
    }

    public void navigateToCart() {
        syscoLabUIOgm.click(lnkCart);
    }

    public void isMyAccountIconClickble() {
        syscoLabUIOgm.isClickable(lnkMyAccount);
    }

    public void isWishListIconClickble() {
        syscoLabUIOgm.isClickable(lnkWishList);
    }

    public void isCartIconClickble() {
        syscoLabUIOgm.isClickable(lnkCart);
    }

    public boolean isHelpMessageContentDisplayed() {
        return syscoLabUIOgm.isDisplayed(lnkHelpMessageContent);
    }

    public boolean isMyAccountIconDisplayed() {
        return syscoLabUIOgm.isDisplayed(lnkMyAccount);
    }

    public boolean isWishListIconDisplayed() {
        return syscoLabUIOgm.isDisplayed(lnkWishList);
    }

    public boolean isCartIconDisplayed() {
        return syscoLabUIOgm.isDisplayed(lnkCart);
    }

}


