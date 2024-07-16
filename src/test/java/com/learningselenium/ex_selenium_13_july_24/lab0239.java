package com.learningselenium.ex_selenium_13_july_24;

import org.apache.commons.exec.CommandLine;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class lab0239 {
    public static void main(String[] args) throws InterruptedException{
        //Browser -Headless (No UI) or full mode
        //1. headless -No Ui Good performance ,fast execution
        //2. Full Mode UI - Perfiramnce lack -> 100

     //   Optional -Browser  -start maximize ,add extansion ,add optional

        EdgeOptions options = new EdgeOptions();
       // options.addArguments("--start-maximized");
        //options.addArguments("window-size=800,600");
        options.addArguments("--guest");

       Proxy proxy =new Proxy();
       proxy.setHttpProxy("123.1334.1232");
       options.setCapability("Proxy",proxy);



        WebDriver driver =new EdgeDriver(options);
        driver.get("www.google.com");
        //driver.manage().window().minimize();
        Thread.sleep(5000);
        driver.quit();
    }
}
