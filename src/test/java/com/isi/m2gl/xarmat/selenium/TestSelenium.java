package com.isi.m2gl.xarmat.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium {
    //  private final WebDriver driver= new FirefoxDriver();
    private  WebDriver driver;
    private  String url;
    private  String password;
    private  String login;
    public TestSelenium() throws  InterruptedException{
        this.driver=new FirefoxDriver();
        this.InitDefaulValues();
        this.loginTest();
    }
    public static void main(String[] args)throws  InterruptedException {
        new TestSelenium();
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

    public void loginTest() throws  InterruptedException {
        this.driver.get(this.url);
        //driver.manage().window().maximize();
        WebElement setlogin =  this.driver.findElement(By.id("login"));
        setlogin.sendKeys( this.login);
        Thread.sleep(2000);
        WebElement setpwd =  this.driver.findElement(By.id("password"));
        setpwd.sendKeys(this.password);
        Thread.sleep(2000);
        WebElement setserv =  this.driver.findElement(By.xpath("//input[@type=\"radio\"][@name=\"service\"][@value=\"1\"]"));
        setserv.click();
        Thread.sleep(2000);
        WebElement setsubmit =  this.driver.findElement(By.id("valider"));
        setsubmit.click();
        this.logoutTest();
    }
    private void InitDefaulValues() {
        this.login="dial";
        this.password="root";
        this.url="http://localhost/sages/";
    }
    public void logoutTest() throws  InterruptedException {
        Thread.sleep(5000);
        this.driver.get(this.url);
        //driver.manage().window().maximize();
        String path="//a[@href=\"";
        path +=this.url;
        path +="Stokage/Famille/1\"";
        WebElement setdropdown =  this.driver.findElement(By.xpath(path));
        setdropdown.click();
       /* Thread.sleep(2000);
        WebElement setpwd =  this.driver.findElement(By.id("password"));
        setpwd.sendKeys("root");
        Thread.sleep(2000);
        WebElement setserv =  this.driver.findElement(By.xpath("//input[@type=\"radio\"][@name=\"service\"][@value=\"1\"]"));
        setserv.click();
        Thread.sleep(2000);
        WebElement setsubmit =  this.driver.findElement(By.id("valider"));
        setsubmit.click();*/
    }

}
