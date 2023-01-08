$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CheckOut.feature");
formatter.feature({
  "line": 2,
  "name": "Feature Check out Product with filter",
  "description": "description feature",
  "id": "feature-check-out-product-with-filter",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CheckOut"
    }
  ]
});
formatter.before({
  "duration": 8444747465,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User purchases 2 items until the product order is successful",
  "description": "",
  "id": "feature-check-out-product-with-filter;user-purchases-2-items-until-the-product-order-is-successful",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User open the website sauce demo",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User input \"standard_user\" as userName and input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User already on PRODUCTS page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User sort product list by name Z to A",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click Item1",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click Item2",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User verify all item name in Cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Remove Test.allTheThings() T-Shirt (Red) from product list",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User click checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User already on CHECKOUT: YOUR INFORMATION",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User input \"diah\" as First Name, \"R\" as Last Name, and \"1188\" as Zip/Postal Code",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User click Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User already on CHECKOUT: OVERVIEW page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User find Item total: \"$7.99\", Tax: \"$0.64\", and Total: \"$8.63\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User click Finish",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User find text THANK YOU FOR YOUR ORDER after complete checkout process",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyDisplay()"
});
formatter.result({
  "duration": 388319661,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 50
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 3495479337,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyProductPage()"
});
formatter.result({
  "duration": 2063812158,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.selectProductContainer()"
});
formatter.result({
  "duration": 6138906880,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickItem1ToCart()"
});
formatter.result({
  "duration": 5074639070,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickItem2ToCart()"
});
formatter.result({
  "duration": 5072137503,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickCartButton()"
});
formatter.result({
  "duration": 3108434701,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyItemName()"
});
formatter.result({
  "duration": 3068598928,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickRemoveItem()"
});
formatter.result({
  "duration": 2059576436,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickCheckOutButton()"
});
formatter.result({
  "duration": 2066500713,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyPersonalInformationPage()"
});
formatter.result({
  "duration": 2039810728,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "diah",
      "offset": 12
    },
    {
      "val": "R",
      "offset": 34
    },
    {
      "val": "1188",
      "offset": 56
    }
  ],
  "location": "PurchaseSteps.inputPersonalInformation(String,String,String)"
});
formatter.result({
  "duration": 3260895618,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickContinueButton()"
});
formatter.result({
  "duration": 2087799172,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyOverviewPage()"
});
formatter.result({
  "duration": 2055228007,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$7.99",
      "offset": 23
    },
    {
      "val": "$0.64",
      "offset": 37
    },
    {
      "val": "$8.63",
      "offset": 57
    }
  ],
  "location": "PurchaseSteps.getTotalItem(String,String,String)"
});
formatter.result({
  "duration": 37271197,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[]$7.99\u003e but was:\u003c[Item total: ]$7.99\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat step_definitions.PurchaseSteps.getTotalItem(PurchaseSteps.java:119)\n\tat ✽.And User find Item total: \"$7.99\", Tax: \"$0.64\", and Total: \"$8.63\"(features/CheckOut.feature:20)\n",
  "status": "failed"
});
formatter.match({
  "location": "PurchaseSteps.userClickFinish()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PurchaseSteps.verifyCheckOutPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 303941031,
  "status": "passed"
});
});