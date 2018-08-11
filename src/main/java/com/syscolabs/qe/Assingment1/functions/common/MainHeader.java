package com.syscolabs.qe.Assingment1.functions.common;

import com.syscolab.qe.core.common.LoggerUtil;
import com.syscolabs.qe.Assingment1.pages.common.CommonPage;
import com.syscolabs.qe.Assingment1.pages.common.MainHeaderList;

/**
 * Created by nipuniS on 8/4/18.
 */


public class MainHeader {

    static MainHeaderList mainHeaderList = new MainHeaderList();
    static CommonPage commonPage = new CommonPage();


    public static void navigateToMyAccount() { mainHeaderList.navigateToMyAccount(); }

    public static void navigateToWishList() {
        mainHeaderList.navigateToWishList();
    }

    public static void navigateToCart() {
        mainHeaderList.navigateToCart();
    }

    public static boolean isHelpMessageContentDisplayed() {
        return mainHeaderList.isHelpMessageContentDisplayed();
    }

    public static boolean isMyAccountIconDisplayed() {
        return mainHeaderList.isMyAccountIconDisplayed();
    }

    public static boolean isWishListIconDisplayed() {
        return mainHeaderList.isWishListIconDisplayed();
    }

    public static boolean isCartIconDisplayed() {
        return mainHeaderList.isCartIconDisplayed();
    }

    public static boolean isConditionsOfUseDisplayed() { return commonPage.isConditionsOfUseDisplayed();
    }

}