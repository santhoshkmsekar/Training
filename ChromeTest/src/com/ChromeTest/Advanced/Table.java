package com.ChromeTest.Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DIGIVAL SOLUTION\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		List<WebElement> column = driver.findElements(By.tagName("th"));
		int coulmnsize = column.size();
		System.out.println(coulmnsize);
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		int rowsize = row.size();
		System.out.println(rowsize);
		WebElement getpercent = driver.findElement(By.xpath("//td[normalize-space() ='Learn to interact with Elements']//following::td[1]"));
		String percent =getpercent.getText();
		System.out.println(percent);
		List <WebElement> allpercentage = driver.findElements(By.xpath("//td[2]"));
		List <Integer>stringtoint = new ArrayList<Integer>();
		for (WebElement webElement : allpercentage) 
		{
			String individual = webElement.getText().replace("%", "");
			stringtoint.add(Integer.parseInt(individual));

		}
		System.out.println(stringtoint);
		int smallvalue = Collections.min(stringtoint);
		System.out.println(smallvalue);
		String smallvaluefinal =Integer .toString(smallvalue);
		String finalxpath ="//td[normalize-space()="+"\""+smallvaluefinal+"%"+"\"]//following::td[1]";
		System.out.println(finalxpath);
		WebElement check = driver.findElement(By.xpath("//td[normalize-space()=\'30%\']//following::td[1]"));
		check.click();
	}


}
