package com.syscolabs.qe.Assingment1.common;

public class Constants {
    public static final String TEST_ENV = System.getProperty("test.env", "QA");
    public static final String TEST_RELEASE = System.getProperty("test.release", "Web_UI_Automation_Assignment_NipuniS");
    public static final String TEST_PROJECT = System.getProperty("test.project", "Web_UI_Automation_Assignment_NipuniS");
    public static final boolean UPDATE_DASHBOARD = Boolean.parseBoolean(System.getProperty("update.dashboard", "true"));
    public static final boolean RUN_LOCALLY = Boolean.parseBoolean(System.getProperty("run.locally", "true"));
    public static final String APP_URL = System.getProperty("app.url", "https://www.bundabergrum.com.au");
    public static final String APP_OS = System.getProperty("app.os", "WIN10");
    public static final String APP_BROWSER = System.getProperty("app.browser", "chrome");


}