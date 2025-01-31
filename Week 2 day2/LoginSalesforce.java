package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSalesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale-in");
		//Attribute Based Xpath - Enter Username
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("dilip@testleaf.com");
		
		//Enter password
		WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));
		passWord.sendKeys("Test@2025");
		
		//Click Login Button
		WebElement loginButton = driver.findElement(By.xpath("//input[@name='Login']"));
		loginButton.click();
		
		
		
		
	}

}
