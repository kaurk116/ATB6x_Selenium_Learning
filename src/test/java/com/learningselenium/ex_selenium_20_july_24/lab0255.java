package com.learningselenium.ex_selenium_20_july_24;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class lab0255 {
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
        driver.get("https://awesomeqa.com/webtable.html");
        // Print all the data in the table. - P1
        // Halen belong to which country  - P2
        WebDriverWait table =new WebDriverWait(driver, Duration.ofSeconds(1000));
        table.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id=\"customers\"]")));


        int row =driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        //table[@id="customers"]/tbody/tr[i]/td[j]
        // i = 1 to 7
        // j = 1 to 3

        //  // xpath ->  //table[@id="customers"]/tbody/tr[5]/td[2]

        // xpath - //table[@id="customers"]/tbody/tr[
        // i
        // ]/td[
        // j
        // ]

        String  firstPath ="//table[@id=\"customers\"]/tbody/tr[";
        String secondPath ="]/td[";
        String thirdPath ="]";

        for (int i = 2; i < row; i++) {
            for (int j = 1; j < col; j++) {
                String Dynamic_XPath =firstPath+secondPath+thirdPath;
                String Data =driver.findElement(By.xpath(Dynamic_XPath)).getText();
                System.out.println(Data);
               if (Data.contains("Yoshi Tannamuri"));
               String countryPath =Dynamic_XPath+"/following-sibling::td";
                String companyPath = Dynamic_XPath+"/preceding-sibling::td";
                String countryText =driver.findElement(By.xpath(countryPath)).getText();
                String companyText =driver.findElement(By.xpath(companyPath)).getText();

                System.out.println("Helen Bennett is In - " + countryText);
                System.out.println("Helen Bennett is Company - " + countryText);

            }

        }

    }

    }
