package com.isi.m2gl.xarmat.selenium;

import com.isi.m2gl.xarmat.XarmatApp;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = XarmatApp.class)
public class Selenium {

    @Test
    public void test1() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "D:\\cours\\M2\\devOps\\geckodriver\\geckodriver.exe");
//        System.setProperty("webdriver.chrome.driver", "D:\\cours\\M2\\devOps\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new FirefoxDriver();
//        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8082/xarmat/");
        driver.manage().window().maximize();
        driver.navigate();
//        driver.manage().window();

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
        search.sendKeys("camera");

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(source, new File("screenmouhamed.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }*/

//        WebElement searchIcon = driver.findElement(By.xpath("//button[@class='btn _prim _md -mls -fsh0']"));
//        searchIcon.click();
        Thread.sleep(5000);
    }
}
