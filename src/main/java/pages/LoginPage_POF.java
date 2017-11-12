package pages;

import org.junit.Assert;

import com.main.AppMain;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage_POF extends AppMain {

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='username']")
	public MobileElement txtbx_UserName;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='password']")
	public MobileElement txtbx_Password;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@text='cross']")
	public MobileElement btn_cross;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(text(),'Sign in')]")
	public MobileElement signin;

	// This is a constructor, as every page need a base driver to find web elements
	public LoginPage_POF(AndroidDriver<?> driver) {
		super(driver);
	}

	public void LogIn_Action() throws InterruptedException {
		pause(5000);
        driver.pressKeyCode(4);
		pause(8000);
	}

	public MobileElement getSigninValue() {
		return signin;
	}
}
