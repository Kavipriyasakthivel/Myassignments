package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InteractWithWebElement {

	public static void main(String[] args) {
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
		//Accounttab
		WebElement accounTab = driver.findElement(By.xpath("//a[text()='Accounts']"));
		accounTab.click();
		//createAccount Button
		WebElement createAccount = driver.findElement(By.linkText("Create Account"));
		createAccount.click();
		//accountName  Textbox
		WebElement accountName = driver.findElement(By.id("accountName"));
		accountName.sendKeys("Kpwo");
		//description  Textbox
		WebElement description = driver.findElement(By.name("description"));
		description.sendKeys("Selenium Automation Tester");
		//Industry  dropdown
		WebElement industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select option = new Select(industry);
		option.selectByVisibleText("Computer Software");
		//ownership  dropdown
		WebElement ownership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select option1 = new Select(ownership);
		option1.selectByVisibleText("S-Corporation");
		//marketing dropdown
		WebElement marketing = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select option2 = new Select(marketing);
		option2.selectByIndex(5);
		//state dropdown
		WebElement state = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select option3 = new Select(state);
		option3.selectByValue("TX");
        //createAccount Button
        WebElement createAccount1 = driver.findElement(By.className("smallSubmit"));
		createAccount1.click();

		
		
		
		
		


}
}
