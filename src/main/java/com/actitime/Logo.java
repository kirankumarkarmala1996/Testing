package com.actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logo {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		 boolean display =driver.findElement(By.xpath("//div[@class='atLogoImg']")).isDisplayed();
		 System.out.println(display);
		 
		 WebElement web = driver.findElement(By.id("headerContainer"));
		 String st= web.getText();
		 System.out.println(st);
		 
		
	}

}
