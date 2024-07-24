package com.learningselenium.ex_selenium_20_july_24;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class lab0251 {
    EdgeDriver driver;
    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }

    @Test(groups = "QA")
    @Description("Select dropdown")
// Add the driver  wait for different-different elements
    public void select_Dropdown() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");

       //Select the option form drop down

        WebElement select_Element = driver.findElement(By.id("dropdown"));
        Select select =new Select(select_Element);
        select.selectByIndex(2);
    }

    @AfterTest
    public  void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
}