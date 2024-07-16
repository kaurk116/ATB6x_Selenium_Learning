package com.learningselenium.ex_selenium_11_july_24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lab0234 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        // WebDriver driver2 = new WebDriver();
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

    }
}
