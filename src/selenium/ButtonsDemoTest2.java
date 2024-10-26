package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsDemoTest2 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/button/");
		WebElement ButtonsDemoTest2=driver.findElement(By.xpath("//input[@class='ui-button ui-corner-all ui-widget']"));
		boolean FindButton=ButtonsDemoTest2.isDisplayed();
		System.out.println("FindButton :"+FindButton);
		if(FindButton==true)
		{
			System.out.println("Verify the button is Displaying");
		}
		else
		{
			System.out.println("Verify button is not Displaying");
		}

		boolean ButtonEnabled=ButtonsDemoTest2.isEnabled();
		System.out.println("ButtonEnabled :"+ButtonEnabled);
		if (ButtonEnabled==true)
		{
			System.out.println("Verify the button is Enabled");

		}
		else
		{
			System.out.println("Verify the button not enabled");
		}
		String VerifyButton=ButtonsDemoTest2.getText();
		System.out.println("VerifyButton :"+VerifyButton);

		ButtonsDemoTest2.click();

	}


}
