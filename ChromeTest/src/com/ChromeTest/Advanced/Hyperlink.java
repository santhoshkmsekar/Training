package com.ChromeTest.Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DIGIVAL SOLUTION\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		WebElement homepage = driver.findElement(By.linkText("Go to Home Page"));
		homepage.click();
		Thread.sleep(3000);
		driver.navigate().back();
		WebElement withoutclicking = driver.findElement(By.partialLinkText("Find where"));
		String  s= withoutclicking.getAttribute("href");
		System.out.println(s);
		Thread.sleep(3000);
		WebElement broken = driver.findElement(By.partialLinkText("Verify am"));
		broken.click();
		String title = driver.getTitle();
		if(title.contains("404"))
		{
			System.out.println("broken");
		}
		
driver.navigate().back();
Thread.sleep(3000);
WebElement homepage1 = driver.findElement(By.linkText("Go to Home Page"));

homepage1.click();
Thread.sleep(3000);
driver.navigate().back();
List <WebElement> link =driver.findElements(By.tagName("a"));
int n  = link.size();
System.out.println(n);
	}

}
