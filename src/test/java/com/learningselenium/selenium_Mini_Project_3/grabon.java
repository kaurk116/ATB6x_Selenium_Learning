package com.learningselenium.selenium_Mini_Project_3;

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
import java.util.concurrent.TimeUnit;

public class grabon {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver();
    }

    @Test(groups = "QA")
    @Description("Search the MiniMac")

    public void openEbayPage() throws InterruptedException {
        driver.get("https://www.grabon.in/indulge/ai-tools/");
        System.out.println(driver.getTitle());
        //xpath
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       List<WebElement> titles2 = driver.findElements(By.cssSelector(".title-ele"));
       for (WebElement SearchTitle : titles2) {
           System.out.println(SearchTitle.getText());
       }

        }
        @AfterTest
        public  void closeBrowser()throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();
    }
}



