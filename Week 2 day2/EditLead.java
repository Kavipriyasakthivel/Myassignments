package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		//Leads
		//div[@class='x-panel-header']/a[contains(text(),'Lea')]-partial text based xpath
		WebElement leads = driver.findElement(By.xpath("//div[@class='x-panel-header']/a[contains(text(),'Lea')]"));
		leads.click();
		//Create Lead
		//a[text()='Create Lead']- text based xpath
		WebElement createLead = driver.findElement(By.xpath("//a[text()='Create Lead']"));
		createLead.click();
		//Company Name
		//input[@id='createLeadForm_companyName']- attribute based xpath
		WebElement companyName = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		companyName.sendKeys("POL");
		//First Name
		//input[@id='createLeadForm_firstName']- attribute based xpath
		WebElement firstName = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		firstName.sendKeys("Pavi");
		//Last Name
		//input[@id='createLeadForm_firstName']- attribute based xpath
		WebElement lastName = driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		lastName.sendKeys("Sa");
		//First Name Local
		//input[@id='createLeadForm_firstName']- attribute based xpath
		WebElement firstNameLocal = driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']"));
		firstNameLocal.sendKeys("S");
		//department Textbox
		WebElement department = driver.findElement(By.name("departmentName"));
		department.sendKeys("HSF");
		//description Textbox
		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("desc");
		//Email address Textbox
		WebElement emailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailAddress.sendKeys("ab@gmail.com");
		//State Dropdown 
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select option = new Select(state);
		option.selectByVisibleText("New York");
		//create lead button
		WebElement createLeadButton = driver.findElement(By.xpath("//input[@value='Create Lead']"));
		createLeadButton.click();
		
		//Edit button
		WebElement editButton = driver.findElement(By.xpath("//a[text()='Edit']"));
		editButton.click();
		Thread.sleep(2000);
	    //description is not cleared with  clear method 
		driver.findElement(By.id("updateLeadForm_description")).clear();
		//Important note textbox
		WebElement importantNote = driver.findElement(By.name("importantNote"));
		importantNote.sendKeys("imp");
		//Update button
		WebElement updateButton = driver.findElement(By.xpath("//input[@value='Update']"));
		updateButton.click();
		
		String title = driver.getTitle();
		System.out.println("Title is:" +title);
		driver.close();
		
		
		
	}

}
