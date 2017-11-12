$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/eBay.feature");
formatter.feature({
  "line": 2,
  "name": "Ebay App Validatiion",
  "description": "",
  "id": "ebay-app-validatiion",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@RegressionSuite"
    }
  ]
});
formatter.before({
  "duration": 11402325008,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Search functionality on the app",
  "description": "",
  "id": "ebay-app-validatiion;search-functionality-on-the-app",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User clicks and enter keyword \"Apple iPhone 7 256gb unlocked\" on Search field",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Sorting product high to low",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Verify Price Sorting of all the products",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Select first product and click on watch",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify Signin page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Apple iPhone 7 256gb unlocked",
      "offset": 31
    }
  ],
  "location": "step.user_is_on_Home_Page(String)"
});
formatter.result({
  "duration": 6784721142,
  "status": "passed"
});
formatter.match({
  "location": "step.sort()"
});
formatter.result({
  "duration": 30663980080,
  "error_message": "org.openqa.selenium.NoSuchElementException: Can\u0027t locate an element by this strategy: Locator map: \n- native content: \"By.chained({By.id: com.ebay.mobile:id/button_sort})\" \n- html content: \"by id or name \"sort\"\"\n\tat io.appium.java_client.pagefactory.AppiumElementLocator.findElement(AppiumElementLocator.java:118)\n\tat io.appium.java_client.pagefactory.interceptors.InterceptorOfASingleElement.intercept(InterceptorOfASingleElement.java:61)\n\tat io.appium.java_client.android.AndroidElement$$EnhancerByCGLIB$$c0b591f0.click(\u003cgenerated\u003e)\n\tat pages.ProductList_POF.clickSort(ProductList_POF.java:45)\n\tat stepDefinition.step.sort(step.java:68)\n\tat ✽.When Sorting product high to low(src/test/resources/Feature/eBay.feature:6)\nCaused by: org.openqa.selenium.TimeoutException: Expected condition failed: waiting for io.appium.java_client.pagefactory.AppiumElementLocator$WaitingFunction@680bddf5 (tried for 30 second(s) with 500 MILLISECONDS interval)\n\tat org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:264)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:232)\n\tat io.appium.java_client.pagefactory.AppiumElementLocator.waitFor(AppiumElementLocator.java:90)\n\tat io.appium.java_client.pagefactory.AppiumElementLocator.findElement(AppiumElementLocator.java:111)\n\tat io.appium.java_client.pagefactory.interceptors.InterceptorOfASingleElement.intercept(InterceptorOfASingleElement.java:61)\n\tat io.appium.java_client.android.AndroidElement$$EnhancerByCGLIB$$c0b591f0.click(\u003cgenerated\u003e)\n\tat pages.ProductList_POF.clickSort(ProductList_POF.java:45)\n\tat stepDefinition.step.sort(step.java:68)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:283)\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:173)\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:153)\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:128)\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:203)\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:155)\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:103)\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.chained({By.id: com.ebay.mobile:id/button_sort})\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027SINGAL155433MAL.local\u0027, ip: \u0027fe80:0:0:0:ef:2edf:df4d:b3d7%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.5\u0027, java.version: \u00271.8.0_141\u0027\nDriver info: driver.version: AndroidDriver\n\tat io.appium.java_client.pagefactory.bys.builder.ByChained.findElement(ByChained.java:72)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:408)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:58)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\n\tat io.appium.java_client.pagefactory.bys.ContentMappedBy.findElement(ContentMappedBy.java:36)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:408)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:58)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\n\tat io.appium.java_client.pagefactory.AppiumElementLocator.lambda$0(AppiumElementLocator.java:112)\n\tat io.appium.java_client.pagefactory.AppiumElementLocator$WaitingFunction.apply(AppiumElementLocator.java:166)\n\tat io.appium.java_client.pagefactory.AppiumElementLocator$WaitingFunction.apply(AppiumElementLocator.java:1)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:209)\n\t... 45 more\n",
  "status": "failed"
});
formatter.match({
  "location": "step.handleSorting()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "step.clickOnWatch()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "step.signinVerify()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2085697718,
  "status": "passed"
});
});