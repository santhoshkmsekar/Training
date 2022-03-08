package com.ChromeTest.Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.Alert;
public class Alertal {

	public static void main(String[] args) throws InterruptedException, AWTException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DIGIVAL SOLUTION\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		WebElement alertbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertbox.click();
		Alert al = driver.switchTo().alert();
		String mesage = driver.switchTo().alert().getText();
		System.out.println(mesage); 
		Thread.sleep(3000);
		al.accept();
		Thread.sleep(3000);
		WebElement alertbox1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		alertbox1.click();
		Thread.sleep(3000);

		al.dismiss();
		Robot robot = new Robot();
		robot.mouseMove(400,400);

	}

}
