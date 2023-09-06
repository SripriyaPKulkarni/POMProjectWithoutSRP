package com.lambdatest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class LoginPage{

   WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

     By enterEmailId= By.xpath("//input[@id='input-email']");
     By enterPassword=By.xpath("//input[@id='input-password']");
    By clickOnLogin=By.xpath("//input[@value='Login']");

    public void enterEmailId(String email) {
        driver.findElement(enterEmailId).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(enterPassword).sendKeys(password);
    }

    public void clickOnLogin() {
        driver.findElement(clickOnLogin).click();
    }

    public void goToURL(){
        driver.get("https://ecommerce-playground.lambdatest.io/");
    }











}
