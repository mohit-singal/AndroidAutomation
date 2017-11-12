package pages;

import com.main.AppMain;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

public class HomePage_POF extends AppMain {
	@AndroidFindBy(id = "com.ebay.mobile:id/search_box")
	public MobileElement search;

	@AndroidFindBy(id = "com.ebay.mobile:id/search_src_text")
	public MobileElement searchText;

	// This is a constructor, as every page need a base driver to find web elements

	public HomePage_POF(AndroidDriver<?> driver) {
		super(driver);

	}

	public void searchAction(String keyword) throws InterruptedException {
		pause(7000);
		getSearch().click();
		getSearchText().sendKeys(keyword + "\n");
	}

	public MobileElement getSearch() {
		return search;
	}

	public MobileElement getSearchText() {
		return searchText;
	}

}