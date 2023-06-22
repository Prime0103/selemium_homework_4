package com_soucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTesting
{
    static String browser = "FireFox";
    static WebDriver driver;
    static String baseUrl = "https://www.saucedemo.com/";

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else if(browser.equalsIgnoreCase("FireFox")){
            driver = new FirefoxDriver();
        }else{
            System.out.println("Wrong Browser Name");
        }

        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println(driver.getTitle());

        System.out.println("Current URL : " + driver.getCurrentUrl());

        System.out.println("Page Source: " + driver.getPageSource());

        //Find the Email Field Element
        driver.findElement(By.id("user-name")).sendKeys("jaimini123");
        driver.findElement(By.id("password")).sendKeys("adf12");

        //close the browser
        driver.close();


    }
}
