package com.learningselenium.ex_selenium_18_july_24;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.plaf.PanelUI;
import java.util.List;

public class lab0246 {
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

        public void openEbayPage ()throws InterruptedException {
            driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");
            System.out.println(driver.getTitle());
            //xpath
            driver.manage().window().maximize();
            Thread.sleep(3000);
            //WebElement searchBox =driver.findElement(By.xpath("//input[@id='gh-ac']"));
         //  WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search for anything']"));
            System.out.println(driver.getTitle());
            // no---driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input ui-autocomplete-loading']"));
            WebElement searchBox =driver.findElement(By.xpath("//input[@name='_nkw']"));
            //driver.findElement(By.xpath("//input[@type='text']"));

            //css selector
          //  driver.findElement(By.cssSelector("#gh-ac"));
            //driver.findElement(By.cssSelector("input[id='gh-ac']"));
            //driver.findElement(By.cssSelector("input[type='text']"));
            //driver.findElement(By.cssSelector("input[placeholder='Search for anything']"));
          //  driver.findElement(By.cssSelector("input[name='_nkw']"));
            //no driver.findElement(By.cssSelector("input[class='gh-tb ui-autocomplete-input ui-autocomplete-loading']"));
            searchBox.sendKeys("macmini");

            WebElement searchButton =driver.findElement(By.xpath("//input[@type='submit']"));
            searchButton.click();
            Thread.sleep(5000);

           // List<WebElement> titles =driver.findElements(By.xpath("//span[@class='SECONDARY_INFO']"));
            //List<WebElement> titles2 =driver.findElements(By.xpath("//div[@class='s-item__subtitle']"));
            List<WebElement> titles2 =driver.findElements(By.cssSelector(".s-item__subtitle"));
            for(WebElement SearchTitle :titles2){
                System.out.println(SearchTitle.getText());

                //span[@class='s-item__price']

               // List<WebElement> Price=driver.findElements(By.xpath("//span[@class='s-item__price']"));
                List<WebElement> Price=driver.findElements(By.cssSelector(".s-item__price"));
                for(WebElement priceList :Price){
                    System.out.println(priceList.getText());

                }
                
            }


        }
        @AfterTest
        public  void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();



        }



}
