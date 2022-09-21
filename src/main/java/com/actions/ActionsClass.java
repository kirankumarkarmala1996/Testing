package com.actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username=driver.findElement(By.name("username"));
		WebElement password= driver.findElement(By.name("pwd"));
		WebElement login= driver.findElement(By.id("loginButton"));
		
//		Actions act = new Actions(driver);
//		act.sendKeys(username, "admin").perform();
//		act.sendKeys(password, "manager").perform();
//		act.click(login).perform();
		
		doActionSendKeys(username, "admin");
		doActionSendKeys(password, "manager");
		doActionClick(login);
		
//		 we can perform the action in two ways using methods
	}
	public static void doActionSendKeys(WebElement element,String values) {
		Actions act = new Actions(driver);
		act.sendKeys(element, values).perform();
		

	}
	public static void doActionClick(WebElement element) {
		Actions act= new Actions(driver);
		act.click(element).perform();
		
	}

}
