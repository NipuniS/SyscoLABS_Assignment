package com.syscolabs.qe.Assingment1.pages.common;

import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolabs.qe.Assingment1.utils.PageBase;
import org.openqa.selenium.By;

/**
 * Created by nipuniS on 8/5/18.
 */
public class MainMenuList extends PageBase {

    private By lnkProducts   = By.xpath("//*[@id=\"nav-wrapper\"]/div[1]/ul[1]/li[1]/a[1]");
    private By lnkDistillery = By.xpath("//*[@id=\"nav-wrapper\"]/div[1]/ul[1]/li[2]/a[1]");
    private By lnkHome       = By.xpath("//*[@id=\"nav-wrapper\"]/div[1]/ul[1]/li[3]/a[1]");
    private By lnkOurStory   = By.xpath("//*[@id=\"nav-wrapper\"]/div[1]/ul[1]/li[4]/a[1]");
    private By lnkExplore    = By.xpath("//*[@id=\"nav-wrapper\"]/div[1]/ul[1]/li[5]/a[1]");
    private By btnSearch     = By.id("search-button");
    private By lblHome    = By.id("home-banner");

    public void moveToProducts() {
        syscoLabUIOgm.move(lnkProducts);
    }

    public void moveToDistillery() {
        syscoLabUIOgm.move(lnkDistillery);
    }

    public void moveToHome() { syscoLabUIOgm.move(lnkHome);    }

    public void moveToOurStory() {
        syscoLabUIOgm.move(lnkOurStory);
    }

    public void moveToExplore() {
        syscoLabUIOgm.move(lnkExplore);
    }


    public void navigateToProducts() {
        syscoLabUIOgm.movePointerTo();
        syscoLabUIOgm.click(lnkProducts);
    }

    public void navigateToDistillery() {
        syscoLabUIOgm.movePointerTo();
        syscoLabUIOgm.click(lnkDistillery);
    }

    public void navigateToHome () {
        syscoLabUIOgm.movePointerTo();
        syscoLabUIOgm.click(lnkHome );
    }

    public void navigateToOurStory() {
        syscoLabUIOgm.movePointerTo();
        syscoLabUIOgm.click(lnkOurStory);
    }

    public void navigateToExplore() {
        syscoLabUIOgm.movePointerTo();
        syscoLabUIOgm.click(lnkExplore);
    }

    public void navigateToSearch() {
        syscoLabUIOgm.movePointerTo();
        syscoLabUIOgm.click(btnSearch );
    }

    public boolean isHomePageDisplayed() {
        return syscoLabUIOgm.isDisplayed(lblHome);
    }

    public boolean isLinkToProductsDisplayed() {
        return syscoLabUIOgm.isDisplayed(lnkProducts);
    }

    public boolean isLinkToDistilleryDisplayed() {
        return syscoLabUIOgm.isDisplayed(lnkDistillery);
    }

    public boolean isLinkToHomeDisplayed() {
        return syscoLabUIOgm.isDisplayed(lnkHome );
    }

    public boolean isLinkToOurStoryDisplayed() {
        return syscoLabUIOgm.isDisplayed(lnkOurStory);
    }

    public boolean isLinkToExploreDisplayed() {
        return syscoLabUIOgm.isDisplayed(lnkExplore);
    }


}