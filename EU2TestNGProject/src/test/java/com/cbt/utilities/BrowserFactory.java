package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String browsertype){

        WebDriver driver = null;

        switch(browsertype.toLowerCase()) {
            case "safari":
                if(System.getProperty("os.name").equalsIgnoreCase("Mac OS X")) {
                    driver = null;
                }else {
                    driver=new SafariDriver();
                }
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
        }
        return driver;
    }
}
