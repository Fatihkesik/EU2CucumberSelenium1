package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class herk {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.youtube.com/user/HerkulNagme/videos");

        WebElement sonbamteli = driver.findElement(By.id("video-title"));
        sonbamteli.getSize();
    }
}
