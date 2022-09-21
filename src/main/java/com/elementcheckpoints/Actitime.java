package com.elementcheckpoints;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actitime {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
//		boolean img=driver.findElement(By.xpath("//*[@id=\"logoContainer\"]/div[1]/div")).isDisplayed();
//		System.out.println(img);
//		
//		  boolean login=driver.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).isEnabled();
//		System.out.println(login);
//		
//		 boolean checkbox=driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
//		 System.out.println(checkbox);
//		 
//		 driver.findElement(By.id("keepLoggedInCheckBox")).click();
//		 boolean checkbox1=driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
//		 System.out.println(checkbox1);
		 
		WebElement username= driver.findElement(By.id("username"));
		WebElement   password =	driver.findElement(By.name("pwd"));
		WebElement login1 = driver.findElement(By.id("loginButton"));
		
		Actions  act = new Actions(driver);
		act.sendKeys(username, "admin").perform();
		act.sendKeys(password, "manager").perform();
		act.sendKeys(login1).perform();
		
		
		
		
		 
		
	}

}
