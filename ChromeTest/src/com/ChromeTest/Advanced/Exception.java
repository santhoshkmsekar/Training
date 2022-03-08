package com.ChromeTest.Advanced;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DIGIVAL SOLUTION\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		try
		{
		WebElement no = driver.findElement(By.className("id"));
			no.click();
	
		
		}
		catch (NoSuchElementException E) {
 			System.out.println("error");
		//throw(e);
		}
		finally {
			System.out.println("hello i am santhosh kumar");

		}
	}

}
