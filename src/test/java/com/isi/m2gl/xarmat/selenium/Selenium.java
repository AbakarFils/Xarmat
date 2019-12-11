package com.isi.m2gl.xarmat.selenium;

import com.isi.m2gl.xarmat.XarmatApp;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;

@SpringBootTest(classes = XarmatApp.class)
public class Selenium {

    @Test
    public void test1() throws InterruptedException, IOException {
//        System.setProperty("webdriver.gecko.driver", "D:\\cours\\M2\\devOps\\geckodriver\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "D:\\cours\\M2\\devOps\\chromedriver_win32\\chromedriver.exe");
//        WebDriver driver = new FirefoxDriver();
        ChromeDriverService service = new ChromeDriverService.Builder()
                .withWhitelistedIps("")
                .withVerbose(true)
                .usingDriverExecutable(new File("D:\\cours\\M2\\devOps\\chromedriver_win32\\chromedriver.exe"))
                .usingPort(8080)
                .build();
        service.start();
        WebDriver driver = new ChromeDriver(service);
        driver.get("http://127.0.0.1:8082/xarmat");
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

        /*WebElement search = driver.findElement(By.id("fi-q"));
        search.sendKeys("camera");*/

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(source, new File("screenmouhamed.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

//        WebElement searchIcon = driver.findElement(By.xpath("//button[@class='btn _prim _md -mls -fsh0']"));
//        searchIcon.click();
        Thread.sleep(5000);
    }
}
