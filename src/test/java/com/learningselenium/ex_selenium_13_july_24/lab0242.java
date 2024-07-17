package com.learningselenium.ex_selenium_13_july_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class lab0242 {
    @Test
    public void VWO_Free_trial_Click() {
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://app.vwo.com");

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
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
            WebElement FreeStart =driver.findElement(By.linkText("Start a free trial"));
            FreeStart.click();
            driver.quit();
        }
    }

