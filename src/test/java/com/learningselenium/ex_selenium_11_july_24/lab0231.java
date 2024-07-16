package com.learningselenium.ex_selenium_11_july_24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lab0231 {
    public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "Drive_Firefox/geckodriver-v0.34.0-linux-aarch64.zip");
        WebDriver driver = new FirefoxDriver();
       // WebDriver driver2 =new ChromeDriver();
        driver.get("https://sdet.live");
        driver.quit();
        // Selenium Flow
        // 1. Create SessionID - q09876q789e8wq89we87
        // Client - Java(Program)
        // Server - Webdriver Edge - Command W3C -> Edge browser
        // 2. Session -> Run the commands - GET -> GET Method w3c Protocol
        // 3. EdgeDriver (Server) -> Tell the Edge Browser
        // 4. Open a Fresh copy of the Edge Browser and
        // Open the URL - https//sdet.live
        // 5. Driver - Command (POST) Request - Shutdown the browser. SessionID == null
    }
}
