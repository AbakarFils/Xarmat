package com.isi.m2gl.xarmat.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class SeleniumTest {


    @Test
    public void authentication() {
        System.setProperty("webdriver.chrome.driver", "/Users/carlosndiaye/Downloads/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/xarmat/");
        driver.manage().window().maximize();

        WebElement openPopUp1 = driver.findElement(By.id("account-menu"));
        openPopUp1.click();

        WebElement openPopUp = driver.findElement(By.id("login"));
        openPopUp.click();

        //WebElement connexionBtn = driver.findElement(By.id("submit"));

        // Thread.sleep(50000);

        WebElement login = driver.findElement(By.id("username"));
        login.sendKeys("admin");


        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("admin");

        // Thread.sleep(50000);
        password.submit();

        TakesScreenshot screenshot  =(TakesScreenshot) driver;

        File source =  screenshot.getScreenshotAs(OutputType.FILE);
    }
}
