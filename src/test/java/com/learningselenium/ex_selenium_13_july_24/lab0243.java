package com.learningselenium.ex_selenium_13_july_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class lab0243 {
    @Test
    public void Start_free_trial() {
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
        WebElement FreeStart =driver.findElement(By.linkText("Start a free trial"));
            FreeStart.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
            WebElement enterEmail =driver.findElement(By.id("page-v1-step1-email"));
            enterEmail.sendKeys("kaurk161@gmail.com");


    //click on checkbox
        WebElement checkbox= driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> buttonList =driver.findElements(By.tagName("button"));
        buttonList.get(0).click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_messga =driver.findElement(By.className("invalid-reason"));
        System.out.println(error_messga.getText());
        driver.quit();
        }
    }

