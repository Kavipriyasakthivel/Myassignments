package week2day1;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch Browser
		WebDriver driver = new ChromeDriver();
		//maximize Browser
		driver.manage().window().maximize();
		//Launch URL
		driver.get("http://leaftaps.com/opentaps/.");
		//Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter a username and password -username Textbox
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");
		//password Textbox
		WebElement passWord = driver.findElement(By.name("PASSWORD"));
		passWord.sendKeys("crmsfa");
		
		//Click the "Login" button - Login Button
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		//Click on the "CRM/SFA" link. -CRM/SFA Link
		WebElement crmClick = driver.findElement(By.linkText("CRM/SFA"));
		crmClick.click();
	
		
		//Click on the "Create Account" button - createAccount Button
		WebElement createAccount = driver.findElement(By.linkText("Create Account"));
		createAccount.click();
		
		//Enter an account name - accountName  Textbox
		WebElement accountName = driver.findElement(By.id("accountName"));
	    accountName.sendKeys("Lai");
		//Enter a description as "Selenium Automation Tester." - description  Textbox
		WebElement description = driver.findElement(By.name("description"));
		description.sendKeys("Selenium Automation Tester");
		
		//numberOfEmployees Textbox
        WebElement numberOfEmployees = driver.findElement(By.id("numberEmployees"));
        numberOfEmployees.sendKeys("2");
        //SiteName Textbox
        WebElement siteName = driver.findElement(By.id("officeSiteName"));
        siteName.sendKeys("LeafTaps");
        //createAccount Button
        WebElement createAccount1 = driver.findElement(By.className("smallSubmit"));
		createAccount1.click();
		Thread.sleep(4000);
		
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(4000);
		if(title.contentEquals(title))
		{
			System.out.println("Correct Title");
		}
		else
		{
			System.out.println("Ttile is incorrect");
		}
		
	}

}
