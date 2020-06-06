package com.cybertek.tests.day4_basic_locaters;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        //make browser fullscreen
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInputBpox = driver.findElement(By.name("full_name"));

        fullNameInputBpox.sendKeys("Mike Smith");

        //put some email and cllick sign up button
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("testt@gmail.com");

        //proper way
        WebElement button = driver.findElement(By.name("wooden_spoon"));
        button.click();

        //lazy way
        //driver.findElement(By.name("wooden_spoon")).click();

        //verify "Thank you for signing up. Click the button below to return to the home page."

        Thread.sleep(3000);
        String expectedMessage = "Thank you for signing up. Click the button below to return to the home page.";

     //   WebElement actualMessageElement = driver.findElement(By.name("signup_message"));

     //   String actualMessage = actualMessageElement.getText();

        //lazy way
        String message = driver.findElement(By.name("signup_message")).getText();

        if(message.equals(expectedMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actualMessage = " + message);
            System.out.println("expectedMessage = " + expectedMessage);
        }
    }
}
