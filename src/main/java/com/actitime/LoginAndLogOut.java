package com.actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAndLogOut {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
	      driver.findElement(By.id("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		  driver.findElement(By.id("loginButton")).click();

//		  instead of i can use timeout ,implicit
//		  Thread.sleep(20000);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By.id("logoutLink")).click();
		  
		  
	}

}
