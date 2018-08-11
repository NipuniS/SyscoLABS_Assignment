package com.syscolabs.qe.Assingment1.pages.login;

import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolabs.qe.Assingment1.utils.PageBase;
import org.openqa.selenium.By;

/**
 * Created by nipuniS on 8/5/18.
 */
public class CreateMyAccountPage extends PageBase {
    protected static SyscoLabUI syscoLabUIOgm;

    private By txtFirstName = By.id("firstname");
    private By txtLastName = By.id("lastname");
    private By txtEmail = By.id("email_address");

    private By drpDate = By.id("");
    private By drpMonth = By.id("");
    private By drpYear = By.id("");
    private By btnCustomDate = By.id("");
    private By btnCustomAge = By.id("");
    private By btnCustomYear = By.id("");

    private By txtMobileNo = By.id("mobile_number");
    private By cbUpdateSMS = By.id("mopt-in-sms");

    private By txtpassword = By.id("password");
    private By txtConfirmpassword = By.id("confirmation");
    private By btnCreateMyAccount = By.id("");




}
