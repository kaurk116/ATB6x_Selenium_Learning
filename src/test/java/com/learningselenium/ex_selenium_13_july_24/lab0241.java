package com.learningselenium.ex_selenium_13_july_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class lab0241 {
    @Test
    public void testVwoLoginNegtive(){
        //Project #1 -TC (-Ve) -Invalid username,password -error message
        //1.open the URL  "https://app.vwo.com/#/login"
        //2.Fine the email id and enter the email id as "admin@admin.com"
        //3. Fne the password input box and enter the password
        //4.Fine and click on button
        //5. verify that the error message is shown "Your  email is ,password ,Ip address.location
        EdgeOptions options=new EdgeOptions();
        options.addArguments("--guest");
        WebDriver driver =new EdgeDriver(options);
        driver.get("https://app.vwo.com/#/login");
        driver.quit();

    }
}
