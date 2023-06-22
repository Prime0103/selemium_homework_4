package com_soucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserTesting
{
    public static void main(String[] args) {

        String baseurl = "https://www.saucedemo.com/";

        //setup the browser
        WebDriver driver = new ChromeDriver();

        //open the baseurl
        driver.get(baseurl);
        // Maximise the Browser
        driver.manage().window().maximize();
        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //get the title
        String title = driver.getTitle();
        System.out.println(title);

        //get the current url
        System.out.println("current url : " + driver.getCurrentUrl());

        //get the current source
        System.out.println("page source : " + driver.getPageSource());

        //enter email to email field
        WebElement username = driver.findElement(By.name("user-name"));
        username.sendKeys("jaimini123");

        //enter the password to password field
        driver.findElement(By.name("password")).sendKeys("aef12");

        //close the browser
        driver.close();


    }
}
