package com.learningselenium.selenium_Mini_Project_3;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class idrive360 {
    @Test
    public void iDrive360() throws InterruptedException {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://www.idrive360.com/enterprise/login");

        Thread.sleep(5000);
      //Enter Email
        WebElement emailInput =driver.findElement(By.id("username"));
        emailInput.sendKeys("augtest_040823@idrive.com");
       // Enter Password
        WebElement passwordInput =driver.findElement(By.id("password"));
        passwordInput.sendKeys("123456");
        Thread.sleep(5000);
        //Login Click
        WebElement button =driver.findElement(By.id("frm-btn"));
        button.click();
       Thread.sleep(50000);
       Assert.assertEquals(driver.getCurrentUrl(),"https://www.idrive360.com/enterprise/account?upgradenow=true");
        Thread.sleep(50000);
        WebElement freeTrial =driver.findElement(By.xpath("//h5[@class=\"id-card-title\"]"));
        Assert.assertTrue(freeTrial.isDisplayed(),"Your free trial has expired");
        //If tile is Filpcart  is filp1234 like
        //img[@contains="flip"])
        //img[starts-with(@title,="flip")]





//








        Thread.sleep(5000);



    }
}
