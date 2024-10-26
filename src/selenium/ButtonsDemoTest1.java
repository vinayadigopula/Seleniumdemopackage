package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsDemoTest1 
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get ("https://www.facebook.com/");
		WebElement ButtonsDemo=driver.findElement(By.xpath("//button[text()='Log in']"));

		String ButtonsText=ButtonsDemo.getText();
		System.out.println("ButtonsText :"+ButtonsText);

		boolean ButtonsDisplayed=ButtonsDemo.isDisplayed();
		System.out.println("ButtonsDisplayed :"+ButtonsDisplayed);
		if(ButtonsDisplayed==true)
		{
			System.out.println("Buttons should be Displayed in Login page");
		}
		else
		{
			System.out.println("Buttons not Displayed");
		}

		boolean ButtonsEnabled=ButtonsDemo.isEnabled();
		System.out.println("ButtonsEnabled :"+ButtonsEnabled);
		if(ButtonsEnabled==true)
		{
			System.out.println("Buttons should be Enabled in Login page");

		}
		else
		{
			System.out.println("Buttons Not Enabled");

		}

		String ActualData=ButtonsDemo.getText();
		System.out.println("ActualData :"+ActualData);
		String  ExpectedData="Log in";
		if(ActualData.equals(ExpectedData))
		{
			System.out.println("Actual data");	
		}
		else
		{
			System.out.println("Expected Data");
		}
		ButtonsDemo.click();

	}

}
