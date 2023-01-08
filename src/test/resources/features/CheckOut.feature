@CheckOut
  Feature: Feature Check out Product with filter
    description feature

    Scenario: User purchases 2 items until the product order is successful
      Given User open the website sauce demo
      When User input "standard_user" as userName and input "secret_sauce" as password
      Then User already on PRODUCTS page
      And User sort product list by name Z to A
      And User click Item1
      And User click Item2
      And User click Cart button
      Then User verify all item name in Cart page
      And Remove Test.allTheThings() T-Shirt (Red) from product list
      And User click checkout button
      Given User already on CHECKOUT: YOUR INFORMATION
      When User input "diah" as First Name, "R" as Last Name, and "1188" as Zip/Postal Code
      And User click Continue Button
      Then User already on CHECKOUT: OVERVIEW page
      And User find Item total: "$7.99", Tax: "$0.64", and Total: "$8.63"
      And User click Finish
      Then User find text THANK YOU FOR YOUR ORDER after complete checkout process

