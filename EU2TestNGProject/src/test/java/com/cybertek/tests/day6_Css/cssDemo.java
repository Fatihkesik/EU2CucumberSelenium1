package com.cybertek.tests.day6_Css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement dontClick = driver.findElement(By.cssSelector("button#disappearing_button"));
        System.out.println(dontClick.getText());

        Thread.sleep(2500);
        driver.quit();

    }
}
