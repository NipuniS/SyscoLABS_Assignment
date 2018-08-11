package com.syscolabs.qe.Assingment1.pages.login;

import com.syscolabs.qe.Assingment1.utils.PageBase;
import org.openqa.selenium.By;
/**
 * Created by nipuniS on 8/5/18.
 */
public class AccountLoginPage extends PageBase {

    private By txtEmail = By.id("email");
    private By txtPassword = By.id("pass");
    private By btnLogin = By.id("send2");

    private By lblEmailVerification = By.id("advice-validate-email-email");
    private By lblPasswordVerification = By.id("advice-validate-password-pass");

    private By lblEmptyEmailVerification = By.id ("advice-required-entry-email");
    private By lblEmptyPassWordVerification = By.id("advice-required-entry-pass");


    public boolean IsLoginButtonDisplayed(){
        syscoLabUIOgm.sleep(1);
        syscoLabUIOgm.mouseHover(btnLogin);
        return (syscoLabUIOgm.isDisplayed(btnLogin));

    }

    public void enterEmail(String email){
        syscoLabUIOgm.sleepInMiliSeconds(200);
        syscoLabUIOgm.sendKeys(txtEmail,email);
    }

    public void enterPassword(String password){
        syscoLabUIOgm.sleepInMiliSeconds(200);
        syscoLabUIOgm.sendKeys(txtPassword,password);
    }

    public void clickLogin(){
        syscoLabUIOgm.click(btnLogin);
    }

    public String getEmailVerification() {
        return syscoLabUIOgm.getText(lblEmailVerification);
    }

    public String getPasswordVerification() {
        return syscoLabUIOgm.getText(lblPasswordVerification);
    }
    public String getEmptyEmailVerification() {
        return syscoLabUIOgm.getText(lblEmptyEmailVerification);
    }
    public String getEmptyPassWordVerification() {
        return syscoLabUIOgm.getText(lblEmptyPassWordVerification);
    }

}
