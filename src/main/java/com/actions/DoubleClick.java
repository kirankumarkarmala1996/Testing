package com.actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act = new Actions(driver);
//		act.contextClick(doubleclick).doubleClick().perform();
		act.doubleClick(doubleclick).doubleClick().perform();

		
//		act.click(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']")));
		Alert alt=driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
	}

}
