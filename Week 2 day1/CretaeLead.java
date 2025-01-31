package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CretaeLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		//Launch Browser
		WebDriver driver = new ChromeDriver();
		//maximize Browser
		driver.manage().window().maximize();
		//Launch URL
		driver.get("http://leaftaps.com/opentaps/.");
		//Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//username Textbox
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");
		//password Textbox
		WebElement passWord = driver.findElement(By.name("PASSWORD"));
		passWord.sendKeys("crmsfa");
		//Login Button
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		//CRM/SFA Link
		WebElement crmClick = driver.findElement(By.linkText("CRM/SFA"));
		crmClick.click();
		//createLead Button        
		WebElement createLeadButton = driver.findElement(By.linkText("Create Lead"));
		createLeadButton.click();
		//firstName Textbox
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Kavi");		
		
		//lastName Textbox
		WebElement lastName = driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		lastName.sendKeys("priya");		
		
		//companyName Textbox
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("XYZ");	
		//title Textbox
		WebElement title = driver.findElement(By.name("generalProfTitle"));
		title.sendKeys("XYZ");
		
		//createLead Button        
		WebElement createLead = driver.findElement(By.name("submitButton"));
		createLead.click();
		String title1 = driver.getTitle();
		System.out.println("The title is:" +title1);
		if(title1.contains("Lead")) 
		{
			System.out.println("Title has Lead");
		}
		else {
			System.out.println("Title doesn't have Lead");
		}
		//Close the Browser
		driver. close();
		
	}

}
