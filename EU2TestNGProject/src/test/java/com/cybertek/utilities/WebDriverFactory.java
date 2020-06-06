package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

            // Task
    //write a static method that takes a string parameter name:browserType
    //based on the valuee of parameter
    //it will setup the browser and
    //the method must return chromedriver or firefoxdriver for me for automation
    //name: getDriver


        public static WebDriver getDriver(String browserType) {

            WebDriver driver = null;

            switch (browserType.toLowerCase()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
            }

            return driver;
         }









}
