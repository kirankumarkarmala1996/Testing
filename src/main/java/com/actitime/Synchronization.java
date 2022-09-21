 package com.actitime;

import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Synchronization {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://demo.actitime.com/login.do");
		 driver.findElement(By.id("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click();
		 
		 
//		 WebDriverWait waitf = new WebDriverWait(driver, 25);
//		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
////		 Thread.sleep(2000);
//		 driver.findElement(By.id("logoutLink")).click();
		 
		 
		 Wait<WebDriver>waitfluent = new FluentWait<WebDriver>(driver)
				 .withTimeout(30,TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
				 .ignoring(NoSuchElementException.class);
		 waitfluent.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		 
		 
	}

}
