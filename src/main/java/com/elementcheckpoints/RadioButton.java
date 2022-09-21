
package com.elementcheckpoints;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///G:/Html/basic%20html%20page.html");
		
		boolean radmale=driver.findElement(By.id("male")).isSelected();
		System.out.println(radmale);
		
		driver.findElement(By.id("male")).click();
		boolean radiomale=driver.findElement(By.id("male")).isSelected();
		System.out.println(radiomale);
		
		
		driver.findElement(By.id("male")).click();
		boolean radiomale1=driver.findElement(By.id("male")).isSelected();
		System.out.println(radiomale1);
		
		
	}

}
