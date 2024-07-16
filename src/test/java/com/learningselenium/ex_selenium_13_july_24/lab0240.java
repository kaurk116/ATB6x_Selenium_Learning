package com.learningselenium.ex_selenium_13_july_24;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class lab0240 {
    public static void main(String[] args) throws InterruptedException{
        EdgeOptions options =new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver =new EdgeDriver(options);
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
