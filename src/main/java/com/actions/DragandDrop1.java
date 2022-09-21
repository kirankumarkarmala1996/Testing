package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://demo.guru99.com/test/drag_drop.html");	
//	WebElement drag = 	driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
//	WebElement drop	= driver.findElement(By.xpath("//*[@id=\"g-mainbar\"]/div/div/div/div/div/div/table/tbody/tr/td[1]/h3"));
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	WebElement drag =driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	Actions act = new Actions(driver);
	Thread.sleep(3000);
	// by using in 2 ways we can drag and drop
//	act.dragAndDrop(drag, drop).perform();
	act.clickAndHold(drag).moveToElement(drop).release().build().perform();
	}

}
