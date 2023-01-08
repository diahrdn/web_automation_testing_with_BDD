package step_definitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.InventoriPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PurchaseSteps {
    private WebDriver webDriver;

    public PurchaseSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
//    @And("User pick item Sauce Labs Backpack")
//    public void clickItemBasket1() throws InterruptedException {
//        InventoriPage inventoriPage = new InventoriPage(webDriver);
//        inventoriPage.clickBasket1();
//        Thread.sleep(5000);
//    }
    @Then("User already on PRODUCTS page")
    public void verifyProductPage() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.productPageIsDisplayed());
        Thread.sleep(2000);

    }
//    @Then("User see Title is \"(.*)\" on landing page")
//    public void verifyLandingPage(String titleName) throws InterruptedException {
//    InventoriPage inventoriPage = new InventoriPage(webDriver);
//    Assert.assertEquals(titleName, inventoriPage.getTitlePage());
//    Thread.sleep(2000);
//    }
    @And(value = "User sort product list by name Z to A")
    public void selectProductContainer() throws InterruptedException {
    InventoriPage inventoriPage = new InventoriPage(webDriver);
    String a = "Name (Z to A)";
    inventoriPage.selectProductContainer(a);
    Thread.sleep(3000);
    }
    @And("User click Item1")
    public void clickItem1ToCart() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        String nameItem1 = "Sauce Labs Onesie";
        inventoriPage.clickItemToCart(nameItem1);
        Thread.sleep(5000);
    }
    @And("User click Item2")
    public void clickItem2ToCart() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        String nameItem2 = "Test.allTheThings() T-Shirt (Red)";
        inventoriPage.clickItemToCart(nameItem2);
        Thread.sleep(5000);
    }
    @And("User click Cart button")
    public void clickCartButton() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickCartButton();
        Thread.sleep(3000);

    }
    @Then("User verify all item name in Cart page")
    public void verifyItemName() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
            inventoriPage.verifyItemNameCheckOut();
            Thread.sleep(3000);
    }

    @And("^Remove Test\\.allTheThings\\(\\) T-Shirt \\(Red\\) from product list$")
    public void clickRemoveItem() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.removeItemCheckout();
        Thread.sleep(2000);
    }
    @And("User click checkout button")
    public void clickCheckOutButton() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickCheckOutButton();
        Thread.sleep(2000);
    }

    @Given("User already on CHECKOUT: YOUR INFORMATION")
    public void verifyPersonalInformationPage() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.personalInformationPageIsDisplayed());
        Thread.sleep(2000);
    }

    @When("User input \"(.*)\" as First Name, \"(.*)\" as Last Name, and \"(.*)\" as Zip/Postal Code")
    public void inputPersonalInformation(String firstName, String lastName, String postalCode) throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.setPersonalInformation(firstName, lastName, postalCode);
        Thread.sleep(3000);
    }

    @And("User click Continue Button")
    public void clickContinueButton() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickContinueButton();
        Thread.sleep(2000);
    }

    @Then("User already on CHECKOUT: OVERVIEW page")
    public void verifyOverviewPage() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.overviewPageIsDisplayed());
        Thread.sleep(2000);
    }

    @And("User find Item total: \"(.*)\", Tax: \"(.*)\", and Total: \"(.*)\"")
    public void getTotalItem(String totalItem, String Tax, String Total) throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertEquals(totalItem, inventoriPage.getTotalItem());
        Assert.assertEquals(Tax, inventoriPage.getTax());
        Assert.assertEquals(Total, inventoriPage.getTotalPurchase());
        Thread.sleep(3000);
    }

    @And("User click Finish")
    public void userClickFinish() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickFinishButton();
        Thread.sleep(2000);
    }

    @Then("User find text THANK YOU FOR YOUR ORDER after complete checkout process")
    public void verifyCheckOutPage() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.checkOutCompletePageIsDisplayed());
        Thread.sleep(2000);

    }
}
