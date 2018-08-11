package com.syscolabs.qe.Assingment1.functions.common;

import com.syscolabs.qe.Assingment1.pages.common.MainMenuList;

/**
 * Created by nipuniS on 8/4/18.
 */


public class MainMenu {

    static MainMenuList mainMenuList = new MainMenuList();

    public static void moveToProducts() {
        mainMenuList.moveToProducts();
    }

    public static void moveToDistillery() {
        mainMenuList.moveToDistillery();
    }

    public static void moveToHome() {
        mainMenuList.moveToHome();
    }

    public static void moveToOurStory() {
        mainMenuList.moveToOurStory();
    }

    public static void moveToExplore() {
        mainMenuList.moveToExplore();
    }


    public static void navigateToProducts() {
        mainMenuList.navigateToProducts();
    }

    public static void navigateToDistillery() {
        mainMenuList.navigateToDistillery();
    }

    public static void navigateToHome() {
        mainMenuList.navigateToHome();
    }

    public static void navigateToOurStory() {
        mainMenuList.navigateToOurStory();
    }

    public static void navigateToExplore() {
        mainMenuList.navigateToExplore();
    }

    public static void navigateToSearch() {
        mainMenuList.navigateToSearch();
    }


    public static boolean isLinkToProductsDisplayed() {
        return mainMenuList.isLinkToProductsDisplayed();
    }

    public static boolean isLinkToDistilleryDisplayed() {
        return mainMenuList.isLinkToDistilleryDisplayed();
    }

    public static boolean isLinkToHomeDisplayed() {
        return mainMenuList.isLinkToHomeDisplayed();
    }

    public static boolean isLinkToOurStoryDisplayed() {
        return mainMenuList.isLinkToOurStoryDisplayed();
    }

    public static boolean isLinkToExploreDisplayed() {
        return mainMenuList.isLinkToExploreDisplayed();
    }

    public static boolean isHomePageDisplayed() {
        return mainMenuList.isHomePageDisplayed();
    }


}