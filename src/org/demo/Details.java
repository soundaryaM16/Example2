package org.demo;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Details {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundarya\\eclipse-workspace\\SeleniumD1\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String driver1 = driver.getTitle();
		System.out.println(driver1);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		WebElement textEmail = driver.findElement(By.id("email"));
		textEmail.sendKeys("somi@123");
		
		WebElement textPass = driver.findElement(By.id("pass"));
		textPass.sendKeys("somi123");
	System.out.println(textPass);
		
	}

}

