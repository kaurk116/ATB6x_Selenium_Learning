package com.learningselenium.ex_selenium_11_july_24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class lab0230 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
            driver.get("https//app.vwo.com");
        System.out.println("open the web_driver");

        driver.navigate().to("ww.google.com");
        //Import Concept of OOPs ->
        // interface interfaceRef = new Class();
        //  1. Inheritance
        //  2. - Upcasting -> Dynamic Dispatch

        WebDriver driver6 = new EdgeDriver();
        WebDriver driver2 = new ChromeDriver();
        //WebDriver driver3 = new FirefoxDriver();
       // WebDriver driver4 = new InternetExplorerDriver();
        //WebDriver driver5 = new SafariDriver();

        //     // Opera - Selenium 4- Removed!

        // SearchContext(I) (2)
        // -> WebDriver(I)( 10)
        // -> RemoteWebDriver(C) (15)
        // -> ChromiumDriver(C) 25
        // -> EdgeDriver(C) (45)

        // Chrome
        // SearchContext(I)
        // -> WebDriver(I)
        // -> RemoteWebDriver(C)
        // -> ChromiumDriver(C)
        // -> ChromeDriver(C)

        // Selenium - Arch - API
        // Create Session, Commands or Functions -> API Request to Browser Driver (
        // Pass the commands as API




    }

}
