package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.telerik.com/contact");
		
		//Select a option in Dropdown1 by using selectByVisibleText
		WebElement Dropdown1 = driver.findElement(By.id("Dropdown-1"));
	    Select option = new Select(Dropdown1);
	    option.selectByVisibleText("General Inquiries");
	    
		
	  //Select by option in Dropdown2 using selectByIndex
	    WebElement Dropdown2 = driver.findElement(By.id("Dropdown-2"));
		Select index = new Select(Dropdown2);
	    index.selectByIndex(10);
	    
	    //Select by option in Dropdown3 using selectByValue
        WebElement Dropdown3 = driver.findElement(By.id("Country-1"));
		Select value = new Select(Dropdown3);
	    value.selectByValue("Canada");
	}

}
