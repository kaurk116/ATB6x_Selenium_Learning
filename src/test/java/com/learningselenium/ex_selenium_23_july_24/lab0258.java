package com.learningselenium.ex_selenium_23_july_24;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class lab0257 {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }
    @Test(groups = "QA")
    @Description("Test Case SVG")
    public void SVG() throws InterruptedException {
        driver.manage().window().maximize();
        String URL = "https://flipkart.com";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement searchbox = driver.findElement(By.xpath("//input[@name=\"q\"]"));
        searchbox.sendKeys("MacMini");

        List<WebElement> svgsearch = driver.findElements(By.xpath("//*[name()=\"svg\"]"));
        svgsearch.get(0).click();

    }
    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}