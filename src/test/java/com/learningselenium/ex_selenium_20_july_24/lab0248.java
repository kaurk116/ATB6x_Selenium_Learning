package com.learningselenium.ex_selenium_20_july_24;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class lab0248 {
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

        Thread.sleep(10000);
        WebElement message = driver.findElement(By.xpath("//span[@data-qa='lufexuloga']"));

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(1000));
        wait2.until(ExpectedConditions.textToBePresentInElement(message, "karamjeet Kaur"));
        // WebElement message=driver.findElement(By.id("page-heading"));
        Assert.assertEquals(message.getText(), "karamjeet Kaur");
        // Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/dashboard");

        WebElement loggedin_username = driver.findElement(By.cssSelector("[data-qa='lufexuloga']"));
        System.out.println("Logged in User details -> " + loggedin_username.getText());
        Assert.assertEquals(message.getText(), "karamjeet Kaur");
    }
        @AfterTest
        public  void closeBrowser() throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();


        }
}
