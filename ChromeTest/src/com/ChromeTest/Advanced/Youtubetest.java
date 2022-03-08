package com.ChromeTest.Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubetest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DIGIVAL SOLUTION\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=FRn5J31eAMw&list=WL&index=1");
Thread.sleep(3000);
		WebElement download = driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Subscribe')]"));
		download.click();
	}

}
