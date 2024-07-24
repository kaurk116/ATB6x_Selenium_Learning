package com.learningselenium.ex_selenium_20_july_24;

import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class lab0252 {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }

    @Test(groups = "QA")
    @Description("Switch to Alert message")

    public void select_Alert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

Thread.sleep(3000);
        //Switch to Alert message
        //button[@onclick='jsAlert()']
        WebElement Alert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        Alert.click();


        //add the wait in element finder
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();


        String message = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(message,"You successfully clicked an alert");
    }
    @AfterTest
    public  void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
}