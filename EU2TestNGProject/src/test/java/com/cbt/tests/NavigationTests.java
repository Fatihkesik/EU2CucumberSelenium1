package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationTests {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String expected1 = "Google";
        Thread.sleep(3000);
        driver.get("https://etsy.com");
        String expected2 ="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Thread.sleep(3000);
        driver.navigate().back();

       String actual1 = driver.getTitle();
       StringUtility.verifyEquals(actual1,expected1);
        driver.navigate().forward();
        String actual2 = driver.getTitle();
        StringUtility.verifyEquals(actual2,expected2);

        driver.close();
    }
}
