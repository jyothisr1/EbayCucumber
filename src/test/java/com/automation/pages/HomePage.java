package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(id="gh-ac")
    WebElement SearchElement1;

    @FindBy(id="gh-btn")
    WebElement SearchBtn;

    @FindBy(xpath="//span[@class='srp-format-tabs-h2' and text()='Buy It Now']")
    WebElement BuyItNow;

    public void openWebSite(){
        driver.get("https://www.ebay.com/");
    }
    public void sendElement1(String element1){
//        System.out.println("printingElementCounting");
        SearchElement1.sendKeys(element1);
        SearchBtn.click();
        BuyItNow.click();
    }
}
