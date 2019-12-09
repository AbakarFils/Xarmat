package com.isi.m2gl.xarmat.selenium;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class SeleniumTest {



    //  private final WebDriver driver= new FirefoxDriver();
    private  WebDriver driver;
    private  String url;
    private  String password;
    private  String login;
    public SeleniumTest() throws  InterruptedException{
        this.driver=new FirefoxDriver();
        this.InitDefaulValues();
        this.test1();
    }
    public static void main(String[] args)throws  InterruptedException {
        new SeleniumTest();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    /*String appURL = "http://google.com";
    @BeforeClass
    public void testSetUp() {
        driver = new FirefoxDriver();
    }
    @Test
    public void verifyGooglePageTittle() {
        driver.navigate().to(appURL);
        String getTitle = driver.getTitle();
        Assert.assertEquals(getTitle, "Google");
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }*/

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    private void InitDefaulValues() {
        this.login="dial";
        this.password="root";
        this.url="http://localhost:8030/";
    }



    public void test1() throws InterruptedException{
        this.driver.get(this.url);
        //Thread.sleep(5000);


        WebElement sbb = this.driver.findElement(By.id("account-menu"));
        sbb.click();
        Thread.sleep(300);
        //Thread.sleep(5000);


        WebElement sbl = this.driver.findElement(By.id("login"));
        sbl.click();

        Thread.sleep(2000);

        WebElement searchname = this.driver.findElement(By.id("username"));
        searchname.sendKeys("admin");
        //Thread.sleep(5000);

        Thread.sleep(2000);
        WebElement searchpwd = this.driver.findElement(By.id("password"));
        searchpwd.sendKeys("admin");

        Thread.sleep(2000);

        TakesScreenshot ts = (TakesScreenshot) this.driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(source, new File("TestSE1/screenshot/screen.png"));

        }catch (IOException e){
            e.printStackTrace();
        }
        WebElement searchIcon = this.driver.findElement(By.xpath("//button[@jhitranslate='login.form.button']"));
        searchIcon.click();
        Thread.sleep(5000);
        //driver.quit();



    }
}
