package com.learningselenium.selenium_Mini_Project_3;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.xpath;

public class grabon2 {
    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver();
    }

    @Test(groups = "QA")
    @Description("The href link is")

    public void openEbayPage() throws InterruptedException {
       // driver.get("https://www.insidr.ai/ai-tools/");
        driver.get("https://www.grabon.in/indulge/ai-tools/#ai-writers");
        System.out.println(driver.getTitle());
        //xpath
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        ////h2[@class="aitools-tool-title"]

        List<WebElement> svgElements = driver.findElements(By.xpath("//svg[@width='13' and @height='13']"));

// Example: Extract 'data-url' attribute or similar from SVG elements
        for (WebElement svg : svgElements) {
            String url = svg.getAttribute("clip-path"); // Replace 'data-url' with the actual attribute name if applicable
            if (url != null) {
                System.out.println("Found URL: " + url);
            }
        }


        /*List<WebElement> URL = driver.findElements(By.xpath("//a[contains(@class,'aitools-visit-link')]"));
       for (WebElement URLList : URL) {
           //System.out.println(URLList.getText());
           String href = ((WebElement) URLList).getAttribute("href");
           System.out.println("The href link is: " + href);
*/
           //String text=driver.findElement(By.xpath("//svg[@class='after-hover']//*[name()='svg' and //*[name()='g']")).getText();
           // System.out.print(text);
           //  }
           //after-hover
       //}
    }
        @AfterTest
        public void closeBrowser ()throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();
        }

}
