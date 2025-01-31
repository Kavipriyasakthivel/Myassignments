package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//Create Button
		WebElement createButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
		createButton.click();
		//firstName Textbox
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Laksh");
		//lasttName Textbox
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys("Narayana");
		//month dropdown
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select opt = new Select(month);
		opt.selectByIndex(0);
		//day dropdown
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select optday = new Select(day);
		optday.selectByValue("7");
		//year dropdown
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select yeardropdown = new Select(year);
		yeardropdown.selectByVisibleText("2000");
		//Female Radio Button
		WebElement female = driver.findElement(By.xpath("//label[text()='Female']/input"));
		female.click();
		/*//Male Radio Button
		WebElement male = driver.findElement(By.xpath("//label[text()='Male']/input"));
		male.click();*/
		
		//mobile or email
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("ahk@gmail.com");
		//password
		WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("Lak@456");
		

	}

}
