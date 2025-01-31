package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	    driver.get("https://leafground.com/checkbox.xhtml");

	    //Click on the "Basic Checkbox.”
	    WebElement basicCheckbox = driver.findElement(By.xpath("//span[text()='Basic']"));
	    basicCheckbox.click();
	    
	    //Click on the "Notification Checkbox
	    WebElement notificationCheckbox = driver.findElement(By.xpath("//span[text()='Ajax']"));
	    notificationCheckbox.click();
	    
	     //Verify that the expected message is displayed
	    WebElement text = driver.findElement(By.xpath("//span[text()='Checked']"));
	    Thread.sleep(1000);
	    //System.out.println(text.getText());
	    boolean expmsg = text.isDisplayed();
	    if(expmsg == true) {
	    	System.out.println("Notification Checkbox is checked");
	    }
	    else
	    {
	    	System.out.println("Notification Checkbox is unchecked");
	    }
	    
	    //Click on your favorite language (assuming it's related to checkboxes). -
	    WebElement favouriteLanguages = driver.findElement(By.xpath("//label[text()='C-Sharp']"));
	    favouriteLanguages.click(); 
	    
	    //Click on the "Tri-State Checkbox.
	    WebElement triState = driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']"));
	    triState.click(); 
	    
	    //Verify which tri-state option has been chosen
	    WebElement trisatechecked = driver.findElement(By.xpath("//span[text()='State has been changed.']"));
	    if(trisatechecked.isSelected()) {
	    	System.out.println("State has been changed");
	    }
	    
	    WebElement toggleSwitch = driver.findElement(By.xpath("//div[@class='ui-toggleswitch ui-widget']"));
	    toggleSwitch.click(); 
	    //Verify that the expected message is displayed
	    
	    WebElement togVeri = driver.findElement(By.xpath("//span[text()='Checked']"));
	    Boolean a = togVeri.isSelected();
	    if(a==true) {
	    	System.out.println("ToggleSwitch is checked");
	    }
	    else
	    {
	    	System.out.println("Toggleswitch is unchecked");
	    }
	    //Verify if the Checkbox is disabled.
	    WebElement disableCheckbox = driver.findElement(By.xpath("//input[@name='j_idt87:j_idt102_input']"));
	    //System.out.println(disableCheckbox.isEnabled());
	    Boolean disabled = disableCheckbox.isEnabled();
	    if(disabled == true) {
	    	System.out.println("Button is enabled");
	    }
	    else {
	    	System.out.println("Button is disabled");
	    } 
	    
	    WebElement selectMultiple = driver.findElement(By.xpath("//div[@aria-haspopup='listbox']"));
	    selectMultiple.click();
	    driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
	    driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
	    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();//close the checkbox;
	    driver.close();
	}

}
