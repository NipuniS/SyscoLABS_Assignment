package com.syscolabs.qe.Assingment1.pages.login;

import com.syscolabs.qe.Assingment1.utils.PageBase;
import org.openqa.selenium.By;
/**
 * Created by nipuniS on 8/5/18.
 */
public class DetailMyAccountPage extends PageBase {

    private By lblWelComeName = By.cssSelector(".welcome-msg>h2.sub-title");
    public String getWelComeMessage() {
        return syscoLabUIOgm.getText(lblWelComeName);
    }

}
