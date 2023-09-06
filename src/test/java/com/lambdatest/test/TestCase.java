package com.lambdatest.test;

import com.lambdatest.base.BaseTest;
import com.lambdatest.pages.HomePage;
import com.lambdatest.pages.LoginPage;
import org.testng.annotations.Test;

public class TestCase extends BaseTest {

    LoginPage loginPage;
    HomePage homePage;

    @Test
    public void loginTest(){

        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        loginPage.goToURL();
        homePage.clickOnAccount();
        loginPage.enterEmailId("kankanaads@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLogin();
    }

}
