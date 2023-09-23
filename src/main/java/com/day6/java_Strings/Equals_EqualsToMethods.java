package com.day6.java_Strings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Equals_EqualsToMethods {
	// ==  vs .equals()
	
	public static WebDriver driver;

	public static void main(String[] args) {
	
       String S1 = new String("Hello");
       String S2 = new String("Hello");
       
       String S3 = "Hello";
       String S4 = "Hello";
       
       
       System.out.println(S1 == S2); //used to compare references
       System.out.println(S3 == S4);
       
       testEqualsMethod();
	}
	
	
	public static void testEqualsMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualEditAccountInfoLink = driver.findElement(By.linkText("Edit your account information")).getText();
		String expectedEditAccountInfoLink = "Edit your account information";
		
		System.out.println(actualEditAccountInfoLink.equals(expectedEditAccountInfoLink));
	}

}
