package com.syscolabs.qe.Assingment1.functions.ageValidation;


import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolabs.qe.Assingment1.common.Constants;
import com.syscolabs.qe.Assingment1.pages.ageValidation.AgeValidationPage;
import com.syscolabs.qe.Assingment1.utils.DriverSetUpUtil;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AgeValidation {

    public static AgeValidationPage ogmLoginPage = new AgeValidationPage();

    public static void navigateToUrl() {
        if (Constants.RUN_LOCALLY) {
            DriverSetUpUtil.setToRunLocally();
            DesiredCapabilities capabilities = null;
            ogmLoginPage.navigateToUrl(capabilities, Constants.APP_URL);
        } else {
            ogmLoginPage.navigateToUrl(DriverSetUpUtil.setToRunRemotely(Constants.APP_OS), Constants.APP_URL);
        }
    }


    public static void validateAge() {
        AgeValidation.setDate();
        AgeValidation.setMonth();
        AgeValidation.setValidYear();
        AgeValidation.clickbtnEnter();
    }

    public void refreshBrowser() {
        ogmLoginPage.refreshBrowser();
    }

    public static void quiteDriver() {
        ogmLoginPage.quitDriver();
    }


    public static void clickbtnEnter() {
        ogmLoginPage.clickbtnEnter();
    }

    public static void clickcbRememberMe() {
        ogmLoginPage.clickcbRememberMe();
    }

    public static void clickLnkConditionOfUse() {
        ogmLoginPage.clicklnkConditionOfUse();
    }


    public static void setDate() {
        ogmLoginPage.clickDate();
        ogmLoginPage.setDate();
    }

    public static void setMonth() {
        ogmLoginPage.clickMonth();
        ogmLoginPage.setMonth();
    }

    public static void setValidYear() {
        ogmLoginPage.clickYear();
        ogmLoginPage.setValidYear();
    }

    public static void setInvalidYear() {
        ogmLoginPage.clickYear();
        ogmLoginPage.setInvalidYear();
    }

    public static void setCountry() {
        ogmLoginPage.clickCountry();
        ogmLoginPage.setCounttry();
    }


    public static String getEnterBirthDayMessage() {
        return ogmLoginPage.getEnterBirthDayMessage();
    }

    public static String getRequiredIdMessage() {
        return ogmLoginPage.getRequiredIdMessage();
    }

    public static String getAgeMissignMessage() {
        return ogmLoginPage.getAgeMissignMessage();
    }




    public static boolean isEnterButtonDisplayed() {
        return ogmLoginPage.isEnterButtonDisplayed();
    }
    public static boolean isEnterButtonClickable() {
        return ogmLoginPage.isEnterButtonClickable();
    }
    public static boolean isCheckBoxDisplayed() {
        return ogmLoginPage.isCheckBoxDisplayed();
    }
    public static boolean isCheckBoxClickable(){
        return ogmLoginPage.isCheckBoxClickable();
    }


}



