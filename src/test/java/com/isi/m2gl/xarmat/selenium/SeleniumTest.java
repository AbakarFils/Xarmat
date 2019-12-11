package com.isi.m2gl.xarmat.selenium;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class SeleniumTest {
    @Test
    public void testConnection() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\diafara\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:9000");
        driver.manage().window().maximize();

        WebElement sbb = driver.findElement(By.id("account-menu"));
        sbb.click();

        WebElement login = driver.findElement(By.id("login"));
        login.click();

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("admin");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("admin");

        WebElement signin = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        signin.click();

        WebElement search = driver.findElement(By.id("fi-q"));
        search.sendKeys("camera");

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(source, new File("screenham.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

//        WebElement searchIcon = driver.findElement(By.xpath("//button[@class='btn _prim _md -mls -fsh0']"));
//        searchIcon.click();
        Thread.sleep(5000);
    }
}