package com.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KRNaction {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://krninformatix.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

//		WebElement courseoffered = driver.findElement(By.xpath("//span[text()='Courses Offered']"));
//		Actions act = new Actions(driver);
//		act.moveToElement(courseoffered).perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.PAGE_UP).perform();
//		Thread.sleep(3000);
//		act.contextClick().perform();
//		act.sendKeys(Keys.ARROW_RIGHT).perform();
//		act.sendKeys("T").perform();
//		Thread.sleep(3000);
//		driver.close();
		WebElement branches = driver.findElement(By.xpath("//span[text()='Branches']"));
		Actions act1 = new Actions(driver);
		
		act1.moveToElement(branches).perform();
		Thread.sleep(3000);
		act1.sendKeys(Keys.ARROW_DOWN).perform();

	}

}
