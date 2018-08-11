package com.syscolabs.qe.Assingment1.functions.login;

import com.syscolabs.qe.Assingment1.pages.login.AccountLoginPage;
import com.syscolabs.qe.Assingment1.pages.login.DetailMyAccountPage;

public class AccountLogin {

    public static AccountLoginPage loginPage = new AccountLoginPage();
    public static DetailMyAccountPage detailMyAccountPage = new DetailMyAccountPage();

    public static boolean IsLoginButtonDisplayed(){
        return loginPage.IsLoginButtonDisplayed();}

    public static String getWelcomeMessage(){
        return detailMyAccountPage.getWelComeMessage();}



    public static void enterEmail(String email){
        loginPage.enterEmail(email);
    }

    public static void enterPassword(String password){
        loginPage.enterPassword(password);
    }

    public static void clickLogin(){
       loginPage.clickLogin();
    }

    public static String getEmailVerification() {
        return loginPage.getEmailVerification();
    }

    public static String getPasswordVerification() {
        return loginPage.getPasswordVerification();
    }

    public static String getEmptyEmailVerification() {
        return loginPage.getEmptyEmailVerification();
    }

    public static String getEmptyPassWordVerification() {
        return loginPage.getEmptyPassWordVerification();
    }



}
