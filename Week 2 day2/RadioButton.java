package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Select your most favourite browser from the radio button
		WebElement favBrowser = driver.findElement(By.xpath("//label[text()='Chrome']"));
		favBrowser.click();
		//click on the radiobutton , the click on the same radio button again to verify it is unselected
		WebElement unselectable = driver.findElement(By.xpath("//label[text()='Chennai']"));
		unselectable.click();
		unselectable.click();
		Boolean b = unselectable.isSelected();
		System.out.println("b is "+b);
		//Identify the radio button initialaly selected by default
		WebElement safariSelected = driver.findElement(By.xpath("(//label[text()='Safari'])[2]"));
		Boolean selected = safariSelected.isSelected();
		System.out.println("The radio button is selected by default "+selected);
		

	}

}
