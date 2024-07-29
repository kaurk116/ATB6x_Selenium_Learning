package com.learningselenium.ex_selenium_23_july_24;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class lab0258 {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }
    @Test(groups = "QA")
    @Description("Test Case SVGIndiaMap")
    public void SVGIndiaMap() throws InterruptedException {
        driver.get("https://www.amcharts.com/svg-maps/?map=india");

        WebDriverWait tablewait = new WebDriverWait(driver, Duration.ofSeconds(3000));
        tablewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()=\"svg\"]")));

       List<WebElement> states =driver.findElements(By.xpath("//*[name()=\"svg\"]/*[name()=\"g\"][7]/*[name()=\"g\"]/*[name()=\"g\"]/*[name()=\"path\"]"));
        for(WebElement state : states){
            System.out.println(state.getAttribute("aria-label"));
            if(state.getAttribute("aria-label").contains("Haryana")){
                state.click();
            }
        }

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