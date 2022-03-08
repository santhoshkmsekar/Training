package com.ChromeTest.Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DIGIVAL SOLUTION\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		WebElement calendarclick = driver.findElement(By.xpath("//*[@id=\'datepicker\']"));
		calendarclick.click();

		WebElement next = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span\r\n"));
		next.click();
		WebElement next1 = driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/a[2]/span"));

		next1.click();
		WebElement dateselect = driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[2]/td[5]/a"));
dateselect.click();
		
	}

}
