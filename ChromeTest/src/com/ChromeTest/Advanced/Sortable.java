package com.ChromeTest.Advanced;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DIGIVAL SOLUTION\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		List<WebElement> sortlist1 = driver.findElements(By.xpath("//*[@id=\'sortable\']/li"));
		int n = sortlist1.size();
		System.out.println(n);
		WebElement from = sortlist1.get(5);
		WebElement to = sortlist1.get(1);
		Actions action = new Actions(driver);
		action.clickAndHold(from);
		action.moveToElement(to);
		action.release(to);
		action.build().perform();
	}

}
