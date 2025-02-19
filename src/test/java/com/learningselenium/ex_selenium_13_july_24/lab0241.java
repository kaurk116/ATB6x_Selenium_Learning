package com.learningselenium.ex_selenium_13_july_24;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class lab0241 {
    @Test
    public void testVwoLoginNegtive() {
        //Project #1 -TC (-Ve) -Invalid username,password -error message
        //1.open the URL  "https://app.vwo.com/#/login"
        //2.Fine the email id and enter the email id as "admin@admin.com"
        //3. Fne the password input box and enter the password
        //4.Fine and click on button
        //5. verify that the error message is shown "Your  email is ,password ,Ip address.location
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--guest");
        //options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new EdgeDriver(options);
        driver.navigate().to("https://app.vwo.com/#/login");

        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        //Fine and Enter the email
        WebElement emailInputbox = driver.findElement(By.id("login-username"));
        emailInputbox.sendKeys("admin@admin.com");
        //Fine and Enter the password
        WebElement passwordinputbox = driver.findElement(By.id("login-password"));
        passwordinputbox.sendKeys("password123");

        //click on sign-in button
        WebElement button =driver.findElement(By.id("js-login-btn"));
        button.click();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
           WebElement errormessage =driver.findElement(By.className("notification-box-description"));
            Assert.assertEquals(errormessage.getText(),"Your email, password, IP address or location did not match");
            driver.quit();
        }
    }

