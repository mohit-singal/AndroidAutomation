package pages;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.main.AppMain;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.Logger;

public class ProductList_POF extends AppMain {
	WebDriverWait wait = new WebDriverWait(driver, 20);

	@AndroidFindBy(id = "com.ebay.mobile:id/button_sort")
	public MobileElement sort;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Highest Price + Shipping']")
	public MobileElement hightolow;

	@AndroidFindBy(id = "com.ebay.mobile:id/textview_item_price")
	public ArrayList<MobileElement> findprices;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.ebay.mobile:id/textview_item_title'][1]")
	public MobileElement firstproduct;

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Buy It Now']")
	public MobileElement watch;

	public ProductList_POF(AndroidDriver<?> driver) {
		super(driver);

	}

	public void clickSort() throws InterruptedException {
		pause(10000);
		getSorted().click();
		getHighToLow().click();
	}

	public void clickWatch() throws InterruptedException {
		pause(10000);
		getFirstProduct().click();
		getWatch().click();
		pause(2000);

	}

	public MobileElement getHighToLow() {
		return hightolow;

	}

	public void verifyPriceSorting() throws InterruptedException {
		pause(20000);
		@SuppressWarnings("unchecked")
		ArrayList<MobileElement> price = (ArrayList<MobileElement>) driver
		.findElementsById("com.ebay.mobile:id/textview_item_price");

		// extract the prices from the price elements and store in a List
		ArrayList<String> prices = new ArrayList<String>();
		for (MobileElement e : price) {
			prices.add(e.getText());
		}
		// make a copy of the list
		ArrayList<String> sortedPrices = new ArrayList<String>(prices);
		// sort the list
		Collections.sort(sortedPrices);
		Collections.reverse(sortedPrices);

		// true if the prices are sorted
		System.out.println("Price list sorting = " + sortedPrices.equals(prices));
		pause(5000);

	}

	public MobileElement getSorted() {
		return sort;
	}

	public MobileElement getFirstProduct() {
		return firstproduct;
	}

	public MobileElement getWatch() {
		return watch;
	}

	public ArrayList<MobileElement> getPrice() {
		return findprices;
	}

}