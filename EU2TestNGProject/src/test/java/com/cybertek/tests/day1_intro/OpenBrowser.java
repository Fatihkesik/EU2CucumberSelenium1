package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

    public static void main(String[] args) {

        //we have to enter this line every time we want to open chrome
        //hey webdrivermanager, can you make chrome ready for me for automation
        WebDriverManager.chromedriver().setup();

        //WebDriver represents the browser
        //we are creating driver for chrome browser
        //new ChromeDriver() >>x this part will open chrome browser

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.cybertekschool.com");

    //    WebDriverManager.firefoxdriver().setup();

   //     WebDriver driver = new FirefoxDriver();

   //     driver.get("https://www.amazon.com");
    }
}
