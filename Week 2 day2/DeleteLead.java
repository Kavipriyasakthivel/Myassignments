package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//maximize Browser
		driver.manage().window().maximize();
		//Launch URL
		driver.get("http://leaftaps.com/opentaps/.");
		//Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter the username
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");
		
		//Enter the password - password Textbox
		WebElement passWord = driver.findElement(By.name("PASSWORD"));
		passWord.sendKeys("crmsfa");
		
		//Click the Login button  -Login Button
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
		//Click the "crm/sfa" link -CRM/SFA Link
		WebElement crmClick = driver.findElement(By.linkText("CRM/SFA"));
		crmClick.click();
		
		//Click the "Leads" link. -Leads
		//div[@class='x-panel-header']/a[contains(text(),'Lea')]-partial text based xpath
		WebElement leads = driver.findElement(By.xpath("//div[@class='x-panel-header']/a[contains(text(),'Lea')]"));
		leads.click();
		
		//Click "Find leads." - Find Leads
		//a[contains(text(),'Find')] - partial text based xpath
		WebElement findLeads = driver.findElement(By.xpath("//a[contains(text(),'Find')]"));
		findLeads.click();
		
		//Click on the "Phone" tab.phone tab
		//span[text()='Phone']
		WebElement phoneTab = driver.findElement(By.xpath("//span[text()='Phone']"));
		phoneTab.click();
		
		//Enter the phone number. -phone number textbox
		//input[@name='phoneNumber'] - attribute based xpath
		/*WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		phoneNumber.sendKeys("9876543895");*/
		
		//Click the "Find leads" button. -findLeads button
		//button[text()='Find Leads'] - text based xpath
		WebElement findLeadsButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeadsButton.click();
		Thread.sleep(2000);
		
		//Capture the lead ID of the first resulting lead.
		WebElement firstLead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String a = firstLead.getText();
		System.out.println("First resulting lead is "+a);
		
		//Click the first resulting lead.
	    firstLead.click();
		
	    //Click the "Delete" button.
		WebElement deleteLead = driver.findElement(By.xpath("//a[text()='Delete']"));
		deleteLead.click();
		
		//Thread.sleep(2000);
		//Click "Find leads" again.
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
	    //Enter the captured lead ID
		WebElement leadId = driver.findElement(By.xpath("//input[@name='id']"));
		leadId.sendKeys(a);
		Thread.sleep(5000);
		
		//Click the "Find leads" button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		
		//Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion
		String deletionConfirmation = "No records to display";
		WebElement h = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String noRecords = h.getText();
		if(deletionConfirmation.contentEquals(noRecords)) {
			System.out.println("Deletion is Successful");
		}
		else
		{
			System.out.println("Record is not deleted");
		}
		
		
		driver.close(); 
		

	}

}
