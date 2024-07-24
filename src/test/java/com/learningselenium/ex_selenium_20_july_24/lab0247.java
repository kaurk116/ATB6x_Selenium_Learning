package com.learningselenium.ex_selenium_20_july_24;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab0247 {
// Add the wait Timeout for all element implicit wait 10 second
    public class VWO_Login_Sucess {
        @Test
        public void vwo_Login() throws InterruptedException {
            EdgeOptions options = new EdgeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            WebDriver driver = new EdgeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //it's for all types of elements
            driver.get("https://app.vwo.com/#/login");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            WebElement EnterEmail = driver.findElement(By.id("login-username"));
            EnterEmail.sendKeys("kaurk161@gmail.com");

            WebElement EnterPassword = driver.findElement(By.id("login-password"));
            EnterPassword.sendKeys("Karamjeet@1990");
            WebElement button =driver.findElement(By.id("js-login-btn"));
            button.click();
            Thread.sleep(10000);
            // WebElement message=driver.findElement(By.id("page-heading"));
            //Assert.assertEquals(message.getText(), "Dashboard");
            Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/dashboard");
            driver.quit();

        }
    }
}
