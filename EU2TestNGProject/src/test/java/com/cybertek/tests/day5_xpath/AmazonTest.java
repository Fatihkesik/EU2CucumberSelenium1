package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com/");

        WebElement inputBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        inputBox.sendKeys("Selenium");

        Thread.sleep(2000);

   //     WebElement searchButton = driver.findElement(By.xpath("//input[@value='Go']"));
   //     searchButton.click();

        driver.findElement(By.xpath("//input[@value='Go']")).click();

        WebElement result = driver.findElement(By.xpath("//span[contains(text(),'Vorschlägen für')]"));
        System.out.println("result.getText() = " + result.getText());

        driver.findElement(By.xpath("//*[text()='Sell']")).click();






    }
}
