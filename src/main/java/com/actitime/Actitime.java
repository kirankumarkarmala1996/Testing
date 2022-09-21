
package com.actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actitime {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		
		String expectedtext ="Enter Time-Track";
		String  actualtext =driver.findElement(By.xpath("(//td[@class='pagetitle'])[1]")).getText();
		
		
		if (expectedtext.equals(actualtext)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}

}
