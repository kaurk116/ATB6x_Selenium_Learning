package com.learningselenium.selenium_Mini_Project_2;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class katalon_make_Appoiment {
    @Test
    public void katalonAppoiment() throws InterruptedException {
        EdgeOptions options =new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver =new EdgeDriver(options);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement makeApp =driver.findElement(By.id("btn-make-appointment"));
        makeApp.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");
        Thread.sleep(5000);

        WebElement username =driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement login =driver.findElement(By.id("btn-login"));
        login.click();
       Thread.sleep(4000);

       Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        Thread.sleep(5000);
        WebElement nextPage= driver.findElement(By.tagName("h2"));
        //Assert.assertEquals(nextPage.getText(), Matcher.);
        Assert.assertTrue(nextPage.isDisplayed(),"Make Appointment");

        Thread.sleep(5000);

        //txt_visit_date

        WebElement visitDate =driver.findElement(By.id("txt_visit_date"));
        visitDate.sendKeys("20/07/2024");

        WebElement comment =driver.findElement(By.id("txt_comment"));
        comment.sendKeys("High Fever");
        Thread.sleep(3000);
        //btn-book-appointment

        WebElement BookAppointment =driver.findElement(By.id("btn-book-appointment"));
        BookAppointment.click();

        Thread.sleep(3000);

        WebElement nextpage2 = driver.findElement(By.tagName("h2"));
        //Assert.assertEquals(nextpage2.getText(), Matcher.equalTo);

        Assert.assertTrue(nextpage2.isDisplayed(), "Appointment Confirmation");
        Thread.sleep(3000);
    }
}
