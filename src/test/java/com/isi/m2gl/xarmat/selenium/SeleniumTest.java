package com.isi.m2gl.xarmat.selenium;

import org.junit.jupiter.api.Test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.Test;

public class SeleniumTest {
	@Test
	public void TestConnexion() {
		try {

			System.out.println("Hello World!");
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://localhost:9090/xarmat/");
			driver.manage().window().maximize();
			WebElement sbb = driver.findElement(By.id("account-menu"));
			sbb.click();
			Thread.sleep(2000);
			sbb = driver.findElement(By.id("login"));
			sbb.click();
			sbb = driver.findElement(By.id("username"));
			sbb.sendKeys("admin");
			sbb = driver.findElement(By.id("password"));
			sbb.sendKeys("admin");
			sbb = driver.findElement(By.className("btn"));
			Thread.sleep(5000);
			sbb.click();
			Thread.sleep(5000);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
