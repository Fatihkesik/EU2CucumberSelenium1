package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");
        
        //getting title with Selenium
        //first short cut to introduce local variable
        //option or ALT + ENTER + ENTER
        //getTitle() --> get you the title of the page
        String title = driver.getTitle();
        //soutv + ENTER to print variable
        System.out.println("title = " + title);
        
        //getCurrentUrl()-->xgets the current url of the page
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        
        //getPageSpurce
        String paceSource = driver.getPageSource();
        System.out.println("paceSource = " + paceSource);
        
    }


}
