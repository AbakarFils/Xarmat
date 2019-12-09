package com.isi.m2gl.xarmat.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;


public class SeleniumTest {

    @Test
    public void testConnexion() {
        // write your code here
        System.setProperty("webdriver.chrome.driver", "/Users/mac/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:9000/#/");
        driver.manage().window().maximize();

        WebElement openPopUp1 = driver.findElement(By.id("login"));
        openPopUp1.click();

        WebElement openPopUp = driver.findElement(By.id("sing"));
        openPopUp.click();

        WebElement connexionBtn = driver.findElement(By.id("submit"));

        // Thread.sleep(50000);

        WebElement login = driver.findElement(By.id("field_nom"));
        login.sendKeys("admin");


        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("passer");

        // Thread.sleep(50000);
        connexionBtn.click();

        TakesScreenshot screenshot  =(TakesScreenshot) driver;

        File source =  screenshot.getScreenshotAs(OutputType.FILE);


    }
}
