package com.elementcheckpoints;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///G:/Html/basic%20html%20page.html");

		boolean report = driver.findElement(By.id("rep")).isSelected();
		System.out.println(report);

		driver.findElement(By.id("rep")).click();
		boolean checkbox = driver.findElement(By.id("rep")).isSelected();
		System.out.println(checkbox);
		Thread.sleep(2000);

		driver.findElement(By.id("rep")).click();
		boolean checkbox1 = driver.findElement(By.id("rep")).isSelected();
		System.out.println(checkbox1);
//		if checkbox is not selected means i want to enter in this block
		if (!checkbox1) {
			driver.findElement(By.id("rep")).click();
			
			
		}
	}

}
