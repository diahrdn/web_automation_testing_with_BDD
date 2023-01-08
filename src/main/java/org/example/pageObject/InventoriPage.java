package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoriPage{
    public static WebDriver driver;

    public InventoriPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver ;
    }

    @FindBy(xpath = "//span[.='Products']")
    private WebElement pageProducts;
    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectContainer;

    @FindBy(id = "shopping_cart_container")
    private WebElement btnCart;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private WebElement itemName;
    @FindBy(xpath = "//div[.='Test.allTheThings() T-Shirt (Red)']")
    private WebElement itemName1;
    @FindBy(xpath = "//div[.='Sauce Labs Onesie']")
    private WebElement itemName2;
    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement removeItem;
    @FindBy(id = "checkout")
    private WebElement btnCheckOutProduct;
    @FindBy(xpath = "//span[.='Checkout: Your Information']")
    private WebElement pagePersonalInformation;
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement fName;
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lName;
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postCode;
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement btnContinue;
    @FindBy(xpath = "//span[.='Checkout: Overview']")
    private WebElement pageOverview;
    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement labelTotalItem;
    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement labelTax;
    @FindBy(xpath = "//div[@class='summary_total_label']")
    private WebElement labelTotal;
    @FindBy(id = "finish")
    private WebElement btnFinish;
    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement pageCheckOutComplete;



//    public void getTitlePage(String title){
//        String titlePage = "//span[@class='"+ title +"']";
//        driver.findElement(By.xpath(titlePage)).getText();
//    }

    public boolean productPageIsDisplayed(){
        return pageProducts.isDisplayed();
    }
    public void selectProductContainer(String sortProductList) throws InterruptedException {
        Select b = new Select(selectContainer);
        b.selectByVisibleText(sortProductList);
        Thread.sleep(3000);
    }
    public void clickItemToCart(String item){
        String addItemToCart = "//div[.='"+ item +"']/ancestor::div[@class='inventory_item_label']"+
                "/following-sibling::div[@class='pricebar']/button";
        driver.findElement(By.xpath(addItemToCart)).click();
    }
    public void clickCartButton(){
        btnCart.click();
    }
    public boolean verifyItemNameCheckOut(){
        itemName1.isDisplayed();
        itemName2.isDisplayed();
        return true;
    }
    public void removeItemCheckout(){
        removeItem.click();
    }
    public void clickCheckOutButton(){
        btnCheckOutProduct.click();
    }
    public boolean personalInformationPageIsDisplayed(){
        return pagePersonalInformation.isDisplayed();
    }
    public void setPersonalInformation(String firstName, String lastName, String postalCode){
        fName.sendKeys(firstName);
        lName.sendKeys(lastName);
        postCode.sendKeys(postalCode);
    }
    public void clickContinueButton(){
        btnContinue.click();
    }
    public boolean overviewPageIsDisplayed(){
        return pageOverview.isDisplayed();
    }
    public String getTotalItem(){
        return labelTotalItem.getText();
    }
    public String getTax(){
        return labelTax.getText();
    }
    public String getTotalPurchase(){
        return labelTotal.getText();
    }
    public void clickFinishButton(){
        btnFinish.click();
    }
    public boolean checkOutCompletePageIsDisplayed(){
        return pageCheckOutComplete.isDisplayed();
    }

}
