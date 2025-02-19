package com.learningselenium.ex_selenium_20_july_24;

import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class lab0254 {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }

    @Test(groups = "QA")
    @Description("Switch to confirmation message")
// Add the driver  wait for different-different elements
    public void select_Dropdown() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");

       Thread.sleep(3000);
        //Select the list of check box
        List<WebElement> Checkboxes = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
        Checkboxes.get(0).click();
        Checkboxes.get(1).click();
    }
    @AfterTest
    public  void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
}