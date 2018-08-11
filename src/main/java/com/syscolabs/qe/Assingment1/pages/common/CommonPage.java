package com.syscolabs.qe.Assingment1.pages.common;


import com.syscolabs.qe.Assingment1.utils.PageBase;
import org.openqa.selenium.By;
/**
 * Created by nipuniS on 8/5/18.
 */

public class CommonPage extends PageBase {

    private By lnkConditionsOfUse = By.id("landingPage");
    private By lblConditions = By.xpath("//*[@id=\"testing\"]/h1/strong");

    public boolean isConditionsOfUseDisplayed(){
        return syscoLabUIOgm.isDisplayed(lblConditions);
    }


}
