package com.learningselenium.ex_selenium_18_july_24;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab0245 {
        @Test
        public void katalonAppoiment() throws InterruptedException {
            EdgeOptions options = new EdgeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            WebDriver driver = new EdgeDriver(options);
            driver.get("https://katalon-demo-cura.herokuapp.com/");
            WebElement makeApp = driver.findElement(By.id("btn-make-appointment"));
            makeApp.click();
            Thread.sleep(5000);
            Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/profile.php#login");
            Thread.sleep(5000);

            //Xpath --Xpath is a query language to find the element in the HTML document
           // Two type od Xpoath
            // Relatives  -user 99%
            //Absolutes-- not use it  1% only
            //Core logic //Tage Name[@Attribute="values"]
            //Functions= test(),contains(),starts-with(),end-with(),sub-string(),normalization()
            //Xpath Axes ---Ancestor(),parents().child(),flowing-sibling(),descendants(),precedent-sibling()


            // CSS Selector -> All  these

            // Logic -  tagName[attribute=value] ->  //tagName[@attribute=value]

            // CSS selectors are used to select elements in an HTML or XML document
            // in order to apply styles or other manipulations to those elements.

            //  Normal Selector  -> Css Selector
            // By.id -> #id
            // className -> .class
            //  custom Attribute - <input type="text" data-qa="abc"/> -> [data-qa="abc"]
            // convert xpath -> css Selector also.

            // Css Selectors ->
            // contains Xpath contains() -> *
            // starts-with() - xpath -> ^
            // end-with() xpath -> $


        }
    }


