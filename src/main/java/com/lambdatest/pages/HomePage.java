package com.lambdatest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePage {

    private WebDriver driver;
    By accountButton= By.xpath("//a[@role='button']//span[@class='title'][normalize-space()='My account']");

    public HomePage(RemoteWebDriver driver) {
        this.driver=driver;
    }

    public void clickOnAccount() {
        driver.findElement(accountButton).click();
    }



}
