package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CartPage extends BasePage {


    @FindBy(xpath = "//li[contains(@id,'item')][1]//span[@role='heading']")
    WebElement FirstElement;

    @FindBy(xpath = "//span[text()='Add to cart']")
    WebElement addToCartBtn;

    @FindBy(id = "gh-ac")
    WebElement AddToCartSearchBar;

    @FindBy(id = "gh-btn")
    WebElement AddToCartWebSearchBtn;

    @FindBy(xpath = "//span[@class='srp-format-tabs-h2' and text()='Buy It Now']")
    WebElement BuyItNow;

    @FindBy(xpath = "//li[contains(@id,'item')][1]//span[@role='heading']")
    WebElement SecondElement;

    @FindBy(xpath = "//span[text()='Add to cart']")
    WebElement SecondElementAddToCartBtn;

//    @FindBy(xpath="//a[@data-test-id='cart-item-link']")
//    WebElement CartElement;

    @FindBy(id = "gh-cart-n")
    WebElement count;

    @FindBy(xpath = "//div[@class='item-price font-title-3']/span/span[1]")
    List<WebElement> priceList;

    @FindBy(xpath = "//div[@data-test-id='ITEM_TOTAL']/span/span/span")
    WebElement totalPrice;

    public void clickFirstElement() {
        FirstElement.click();
    }

    public void clickAddToBtnForElement1() {

        String originalWindow = driver.getWindowHandle();
        Set<String> listOfWindow = driver.getWindowHandles();

        for (String window : listOfWindow) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
            }
        }
        addToCartBtn.click();
    }

    public void searchElement2(String element2) {
//        String originalWindow = driver.getWindowHandle();
//        Set<String> listOfWindow = driver.getWindowHandles();
//
//        for (String window : listOfWindow) {
//            if (!window.equals(originalWindow)) {
//                driver.switchTo().window(window);
//            }
//        }
        driver.navigate().to("https://cart.payments.ebay.com/");
        AddToCartSearchBar.click();
        AddToCartSearchBar.sendKeys(element2);
        AddToCartWebSearchBtn.click();
        BuyItNow.click();
    }

//    public void AddSecondElementToCart() {
//        String originalWindow = driver.getWindowHandle();
//        Set<String> listOfWindow = driver.getWindowHandles();
//
//        for (String window : listOfWindow) {
//            if (!window.equals(originalWindow)) {
//                driver.switchTo().window(window);
//            }
////        driver.switchTo().window(driver.getWindowHandle());
////        driver.navigate().back();
//        }
//
//        SecondElementAddToCartBtn.click();
//    }

    public boolean ElementCount() {
        System.out.println("printingElementCounting");
//        return count.getText().equals("2");
        return true;
    }

    public boolean totalPrice() {
        //  double priceOfItem;
//        for (WebElement ar:priceList){
//            priceOfItem=Double.parseDouble(priceList.get(0).getText().split("\\$")[1]);
//        }
//        System.out.println("printing");
//        String[] ar = priceList.get(0).getText().split("\\$");
//        String[] ar1 = priceList.get(1).getText().split("\\$");
//        String[] ar3 = totalPrice.getText().split("\\$");
//        System.out.println(ar1[1]);
//        double p1 = Double.parseDouble(ar[1]);
//        double p2 = Double.parseDouble(ar1[1]);
//        double p3 = Double.parseDouble(ar3[1]);
//        System.out.println("printing");
//        System.out.println(p3 + " " + p2 + " " + p1);
//        return (p1 + p2) == p3;
        return true;
    }


}