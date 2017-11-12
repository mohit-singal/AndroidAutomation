@RegressionSuite
Feature: Ebay App Validatiion

  Scenario: Search functionality on the app 
   Given User clicks and enter keyword "Apple iPhone 7 256gb unlocked" on Search field
   When Sorting product high to low
   And Verify Price Sorting of all the products
   And Select first product and click on watch
   Then Verify Signin page
   
