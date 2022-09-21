package com.actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Geturl {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		
		String expectedurl = "https://demo.actitime.com/user/submit_tt.do";
		String actualurl= driver .getCurrentUrl();
		if (expectedurl.equals(actualurl)) {
			System.out.println("pass");
			
		}else {
			System.out.println("fail");
		}
		
	}

}
