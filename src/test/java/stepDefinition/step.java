package stepDefinition;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import pages.ProductList_POF;
import pages.HomePage_POF;
import pages.LoginPage_POF;
import utils.Logger;
import utils.ReadConfigData;

/**
 * @author msingal Step definition of login functionality having the
 *         implementation of all the test cases in the feature file.
 */
public class step {

	AndroidDriver<?> driver;
	HomePage_POF homepage;
	LoginPage_POF loginpage;
	ProductList_POF productpage;
	Logger logger = new Logger().getLogger(step.class);

	@Before
	public void setUp() throws Exception {
		DesiredCapabilities d = new DesiredCapabilities();
		File appDir = new File("src/test/resources");
		File app = new File(appDir, "com.ebay.mobile.apk");
		d.setCapability(MobileCapabilityType.DEVICE_NAME, ReadConfigData.getInstance().getDeviceName());
		d.setCapability(MobileCapabilityType.PLATFORM_NAME, ReadConfigData.getInstance().getPlatformName());
		d.setCapability(MobileCapabilityType.PLATFORM_VERSION, ReadConfigData.getInstance().getPlatformVersion());
		d.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver(new URL(ReadConfigData.getInstance().getAppiumDriverURL()), d);
		d.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		homepage = new HomePage_POF(driver);
		loginpage = new LoginPage_POF(driver);
		productpage = new ProductList_POF(driver);

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Given("^User clicks and enter keyword \"([^\\\"]*)\" on Search field$")
	public void user_is_on_Home_Page(String keyword) throws Throwable {
		logger.info("Entering search keyword");
		homepage.searchAction(keyword);
	}

	@When("^Sorting product high to low$")
	public void sort() throws Throwable {
		logger.info("Sorting high to low");
		productpage.clickSort();
	}

	@And("^Verify Price Sorting of all the products$")
	public void handleSorting() throws Throwable {
		logger.info("Verify price sorting");
		productpage.verifyPriceSorting();
	}

	@And("^Select first product and click on watch$")
	public void clickOnWatch() throws Throwable {
		logger.info("selection of product and click on watch");
		productpage.clickWatch();

	}

	@Then("^Verify Signin page$")
	public void signinVerify() throws Throwable {
		logger.info("Verifying signin page and redirecting to description page");
		loginpage.LogIn_Action();

	}

}
