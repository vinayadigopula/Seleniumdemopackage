package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LabelTest1 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get ("http:gmail.com");
		String Actualvalue=driver.findElement(By.xpath("//span[text()='to continue to Gmail']")).getText();
		String Expectedvalue="to Continue to Gmail";
		if(Actualvalue.equals(Expectedvalue))
		{
     System.out.println("Data is matching");

		}
		
		else
		{
			System.out.println("Data is not matching");
		}
	}
	
}
