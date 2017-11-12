package utils;

import utils.AppConstant;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;


/**
 * @author msingal
 *It is used to fetch data from config.properties
 */
public class ReadConfigData {

    private static ReadConfigData objReadProperties;
    private static Properties objProperties;
   

    private ReadConfigData() {
    }

    public static ReadConfigData getInstance() throws IOException {
        //logger.enterMethod();
        if (objReadProperties == null) {
            objProperties = new Properties();
            FileInputStream f = new FileInputStream(AppConstant.CONFIG_PATH);
            objProperties.load(f);
            objReadProperties = new ReadConfigData();
        }
        //logger.exitMethod();
        return objReadProperties;
    }

    public int getImplicitWait() {
        return Integer.parseInt(objProperties.getProperty("implicit.wait.timeout"));
    }

    /**
     * Method to return explicit wait from property
     *
     * @return
     */
    public int getExplicitWait() {
        return Integer.parseInt(objProperties.getProperty("explicit.wait.timeout"));
    }

    /**
     * Method to return default page load timeout
     *
     * @return
     */
    public int getPageLoadTimeout() {
        return Integer.parseInt(objProperties.getProperty("page.load.timeout"));
    }

    public int getRetryCount() {
        return Integer.parseInt(objProperties.getProperty("webelement.retry.count"));
    }

    public String getDeviceName() {
        return objProperties.getProperty("deviceName");
    }
    public String getAutomationName() {
        return objProperties.getProperty("Automation_Name");
    }public String getAppPath() {
        return objProperties.getProperty("app");
    }

    


    		
    public String getPrimaryUser() {
        return objProperties.getProperty("user.name");
    }

    public String getPrimaryPassword() {
        return objProperties.getProperty("user.password");
    }

    public String getPlatformName() {
        return objProperties.getProperty("platformName");
    }

      public boolean isLoggerNeeded() {
        if (objProperties.getProperty("logger.enabled").trim().equals("1")) {
            return true;
        } else {
            return false;
        }

    }

    public String getPlatformVersion() {
        return objProperties.getProperty("platformVersion");
    }
    
    public String getAppiumDriverURL() {
        return objProperties.getProperty("AppiumDriverURL");
    }

    public boolean isImplicitBrowserCloseEnabled() {
        if (objProperties.getProperty("implicit.browser.close").trim().equals("1")) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isScreenShotEnabled() {
        if (objProperties.getProperty("snapshot.enabled").equals("1")) {
            return true;
        } else {
            return false;
        }

    }

   
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n");
        stringBuilder.append("                           Configuration Details                       " + "\n");
        stringBuilder.append("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n");
        stringBuilder.append("Implicit Wait : " + getImplicitWait() + " sec");
        stringBuilder.append("Explicit Wait : " + getExplicitWait() + " sec");
        stringBuilder.append("Page load timeout : " + getPageLoadTimeout() + " sec");
        stringBuilder.append("Platform version " + getPlatformVersion());
        stringBuilder.append("Application Primary  user name : " + getPrimaryUser());
        stringBuilder.append("Platform Name : " + getPlatformName());
        stringBuilder.append("Page load timeout : " + getPageLoadTimeout() + " sec");
        stringBuilder.append("Application path " + getAppPath());
        stringBuilder.append("Device Name : " + getDeviceName());
        stringBuilder.append("Automation Name : " + getAutomationName());
        stringBuilder.append("Appium Driver URL : " + getAppiumDriverURL());

        return stringBuilder.toString();
    }
}