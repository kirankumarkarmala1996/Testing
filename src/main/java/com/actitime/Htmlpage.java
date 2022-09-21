package com.actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Htmlpage {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///G:/Html/basic%20html%20page.html");
		
		
		boolean checkbox =driver.findElement(By.id("rep")).isSelected();
		System.out.println(checkbox);
		
		
		driver.findElement(By.id("rep")).click();
		boolean checkbox1=driver.findElement(By.id("rep")).isSelected();
		System.out.println(checkbox1);
		
		driver.findElement(By.id("rep")).click();
		boolean checkbox2=driver.findElement(By.id("rep")).isSelected();
		System.out.println(checkbox2);
		
		
		
		
	}

}
