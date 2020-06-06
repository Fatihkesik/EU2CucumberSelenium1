package com.cybertek.tests.VyTruck;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class cv {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://beginnersbook.com/2013/12/hashmap-in-java-with-example/");

    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(2000);
       // driver.quit();
    }

 //   @Test
 //   public void printTable(){
 //       WebElement table = driver.findElement(By.tagName("style"));
 //       table.

}
