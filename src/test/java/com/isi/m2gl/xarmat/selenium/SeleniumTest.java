package com.isi.m2gl.xarmat.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class SeleniumTest {

    @Test
    public void testconnecxion() {
        // write your code here
        System.setProperty("webdriver.chrome.driver", "D:\\Logiciel\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("http://localhost:9000/#/");
        driver.get("http://localhost:8070/xarmat/");
        driver.manage().window().maximize();

        WebElement openPopUp1 = driver.findElement(By.id("account-menu"));
        WebElement openPopUp2 = driver.findElement(By.id("login"));
        openPopUp1.click();
        openPopUp2.click();

        //WebElement openPopUp = driver.findElement(By.id("sing"));
        //openPopUp.click();

        WebElement connexionBtn = driver.findElement(By.id("submit"));



        WebElement login = driver.findElement(By.id("username"));
        login.sendKeys("admin");


        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("admin");


        connexionBtn.click();

        TakesScreenshot screenshot  =(TakesScreenshot) driver;

        File source =  screenshot.getScreenshotAs(OutputType.FILE);

       /* try {

        } catch (IOException e) {
            e.printStackTrace();
        }*/



    }
}
