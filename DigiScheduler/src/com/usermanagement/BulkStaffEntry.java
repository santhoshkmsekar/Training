package com.usermanagement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BulkStaffEntry {

	public static void main(String[] args)throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DIGIVAL SOLUTION\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://staging.digischeduler.digivalsolutions.com/login");
		WebElement username = driver.findElement(By.xpath("//*[@id=\'root\']/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/input"));
		username.sendKeys("digiproductsadmin@digi.com");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//*[@id=\'root\']/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[3]/div/input"));
		password.sendKeys("Digival@123");
		Thread.sleep(2000);
		WebElement sigin = driver.findElement(By.xpath("//*[@id=\'root\']/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[5]/button"));
		sigin.click();
		Thread.sleep(2000);
		WebElement otp = driver.findElement(By.xpath("//*[@id=\'root\']/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[3]/div/input"));
		otp.sendKeys("1234");
		Thread.sleep(2000);
		WebElement done = driver.findElement(By.xpath("//*[@id=\'root\']/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[4]/div[3]/button"));
		done.click();
		Thread.sleep(7000);
		WebElement inputbutton = driver.findElement(By.xpath("//*[@id=\'root\']/div[1]/div[2]/div/div[2]/div/div[1]/div/div/div[1]/span[1]"));
		inputbutton.click();
		Thread.sleep(2000);

		WebElement usermanagement = driver.findElement(By.xpath("//*[@id=\'root\']/div[1]/div[2]/div/div[1]/a[2]/span[1]"));
		usermanagement.click();
		Thread.sleep(2000);

		WebElement staffmanagement = driver.findElement(By.xpath("//*[@id=\'root\']/div[1]/div[2]/div/div[1]/a[3]/span"));
		staffmanagement.click();
		Thread.sleep(2000);

		WebElement registrationpending = driver.findElement(By.xpath("//*[@id=\'menu\']/a[2]"));
		registrationpending.click();
		Thread.sleep(2000);

		WebElement addnew = driver.findElement(By.xpath("//*[@id=\'dropdown-basic-button\']"));
		addnew.click();
		Thread.sleep(2000);

		WebElement bulkimport = driver.findElement(By.xpath("//*[@id=\'root\']/div[1]/div[2]/div/div[2]/div/div[5]/div[2]/div[2]/div[1]/div/div/a[2]"));
		bulkimport.click();
		Thread.sleep(2000);

		WebElement importfile = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/div[2]/label"));
		importfile.click();
		Thread.sleep(2000);
		StringSelection selection = new StringSelection("C:\\Users\\DIGIVAL SOLUTION\\Downloads\\sample-import-staff-lists.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);	
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		WebElement confirm = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/button"));
		confirm.click();
		
	}

}
