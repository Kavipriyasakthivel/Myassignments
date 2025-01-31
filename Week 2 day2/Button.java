package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		// click and confirm title
		WebElement clickButton = driver.findElement(By.xpath("//span[text()='Click']"));
		clickButton.click();
		// Verify title is Dashboard
		String title = driver.getTitle();
		if(title.equals("Dashboard")) {
			System.out.println("Title is Correct");
		}
		else
		{
			System.out.println("Title is InCorrect");
		}
		driver.navigate().back();
		
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled. -Verify button is disabled or enabled
		WebElement disabledButton = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']"));
		boolean dis = disabledButton.isEnabled();
		if(dis==true) {
			System.out.println("Button is Enabled");
		}
		else {
			System.out.println("Button is Disabled");
		}
		//Find and print the position of the button with the text ‘Submit.’
		WebElement submitPosition = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		int a = submitPosition.getLocation().getX();
		int b = submitPosition.getLocation().getY();
		System.out.println("poition is" + a +b);
		
		//Find and print the background color of the button with the text ‘Find the Save button color
		WebElement saveCss = driver.findElement(By.xpath("//span[text()='Save']"));
		saveCss.getCssValue("background-color");
		System.out.println("color is" +saveCss);
		
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.
		WebElement submitSize = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		int height = submitSize.getSize().getHeight();
		int width = submitSize.getSize().getWidth();
		System.out.println("The height and width is" +height + width);
		driver.close();
		
}

}
