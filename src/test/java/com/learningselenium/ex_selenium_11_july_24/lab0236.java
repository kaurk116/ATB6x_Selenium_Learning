package com.learningselenium.ex_selenium_11_july_24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class lab0236 {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://bing.com");

        //  // No back, forward allowed in case of get

        driver.navigate().to("https://app.vwo.com");
        driver.navigate().to(new URL("https://google.com"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }
    }
