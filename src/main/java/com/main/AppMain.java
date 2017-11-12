package com.main;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public abstract class AppMain {
protected final AndroidDriver<?> driver;

public AppMain(AndroidDriver<?> driver)
{this.driver=driver;
PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
	}

public  void pause(double seconds) throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait((long) seconds, TimeUnit.SECONDS);
}

public void waitForScreenToLoad(AndroidDriver driver, MobileElement element, int seconds){

    WebDriverWait wait = new WebDriverWait(driver,seconds);
    wait.until(ExpectedConditions.visibilityOf(element));
}
}
