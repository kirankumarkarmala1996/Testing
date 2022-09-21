package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	
	WebElement drag =driver.findElement(By.id("draggable"));
	WebElement drop= driver.findElement(By.id("droppable"));
	
	Actions act = new Actions(driver);
	Thread.sleep(4000);
	act.dragAndDrop(drag, drop).perform();
//	act.clickAndHold(drag).moveToElement(drop).release().build().perform();
	
	}

}
