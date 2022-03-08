package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	public String baseurl = "https://dsweb-staging.digi-val.com/login";
	String driverpath ="C:\\Users\\DIGIVAL SOLUTION\\Downloads\\chromedriver.exe";
	public WebDriver driver;

	
	public void f() {
		System.setProperty("webdriver.chrome.driver","driverpath");
		driver = new ChromeDriver();
		driver.get("baseurl");

		WebElement username = driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div[2]/div[1]/div[2]/div/div/form/div[1]/div/div[1]/input"));
		username.sendKeys("siva@gmail.com");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div[2]/div[1]/div[2]/div/div/form/div[2]/div/div[1]/input"));
		password.sendKeys("8870515387");
		Thread.sleep(2000);
		WebElement sigin = driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div[2]/div[1]/div[2]/div/div/form/button"));
		sigin.click();
		Thread.sleep(2000);
		WebElement mycourse = driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/aside/ul/a[2]/div"));
		mycourse.click();
		WebElement inprogress = driver.findElement(By.xpath("//*[@id=\'mainMin\']/div/div[2]/div[1]/div/div/div/span[2]"));
		String inprogresstext = inprogress.getText();
		System.out.println(inprogresstext);
		WebElement tostart = driver.findElement(By.xpath("//*[@id=\'mainMin\']/div/div[2]/div[1]/div/div/div/span[1]"));
		String tostarttext = tostart.getText();
		System.out.println(tostarttext);
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//*[@id=\'searchQuestion\']"));
		String searchboxtext = search.getAttribute("placeholder");
		System.out.println("print"+searchboxtext);
		Thread.sleep(20000);
		driver.close();
	}
}
