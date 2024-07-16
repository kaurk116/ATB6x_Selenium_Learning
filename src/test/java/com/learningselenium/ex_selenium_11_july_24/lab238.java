package com.learningselenium.ex_selenium_11_july_24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class lab238 {
    @Test
    public void testVWOLoginTitle() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        //driver.get("app.vwo.com"); // http mandatory
        driver.get("https://app.vwo.com");
        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();
    }
}
