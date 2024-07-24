package com.learningselenium.ex_selenium_20_july_24;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.learningselenium.ex_selenium_20_july_24.WaitHelpers.checkVisibility;

public class lab0250{
    EdgeDriver driver;
    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }

    @Test(groups = "QA")
    @Description("Search the MiniMac")
// Add the driver  wait for different-different elements
    public void vwo_Login() throws InterruptedException {
        driver.get("https://app.vwo.com/#/login");

        //add the wait in element finder
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-username")));


        WebElement EnterEmail = driver.findElement(By.id("login-username"));
        EnterEmail.sendKeys("kaurk161@gmail.com");

        WebElement EnterPassword = driver.findElement(By.id("login-password"));
        EnterPassword.sendKeys("Karamjeet@1990");
        WebElement button = driver.findElement(By.id("js-login-btn"));
        button.click();


        // Wait to Dashboard to Load - Fluent Wait
        Wait<EdgeDriver> wait2 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2)) //5 Times
                .ignoring(NoSuchElementException.class);

        WebElement loggedin_username = wait2.until(driver -> driver.findElement(By.cssSelector("[data-qa='lufexuloga']")));
        System.out.println("Logged in User details -> " + loggedin_username.getText());
        Assert.assertEquals(loggedin_username.getText(), "karamjeet Kaur");
    }
    @AfterTest
    public  void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
}