package com.actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobutton {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///G:/Html/basic%20html%20page.html");
		
		boolean select = driver.findElement(By.id("male")).isSelected();
		System.out.println(select);
		
		driver.findElement(By.id("male")).click();
		boolean select1=driver.findElement(By.id("male")).isSelected();
		System.out.println(select1);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("male")).click();
		boolean select2 = driver.findElement(By.id("male")).isSelected();
		System.out.println(select2);
		
//		if (!select2) {
//			driver.findElement(By.id("male")).click();
//			System.out.println("its click");
//		}else {
//			System.out.println("its not click");
//		}
	}

}
