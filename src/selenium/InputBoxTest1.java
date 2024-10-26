package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxTest1 
{

	public static void main(String[] args)
	{

		WebDriver driver = new ChromeDriver();
		driver.get ("http:gmail.com");
		boolean InputBoxDisplay=driver.findElement(By.xpath("//input[@id='identifierId']")).isDisplayed();
		System.out.println("InputBoxDisplay :"+InputBoxDisplay);
		if (InputBoxDisplay==true)
		{
			System.out.println("InputBox is Displayed");
		}

		else
		{
			System.out.println("InpuBox is Not Displayed");
		}



		boolean InputBoxEnable = driver.findElement(By.xpath("//input[@id='identifierId']")).isEnabled();
		System.out.println("InputBoxEnable :"+InputBoxEnable);
		if (InputBoxEnable==true)
		{
			System.out.println("InputBox is Enabled");
		}
		else
		{
			System.out.println("InpuBox is Not Enabled");
		}
		String actualWaterMark=driver.findElement(By.xpath("//input[@id='identifierId']")).getAttribute("aria-label");
		System.out.println("actualWaterMark :"+InputBoxEnable);
		String ExpectedwaterMarkValue="Email or phone";
		if(actualWaterMark.equals(ExpectedwaterMarkValue))
		{
			System.out.println("WaterMark is Displaying");
		}
		else
		{
			System.out.println("WaterMark is NotDisplaying");
		}

		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("RBG Technologies");
		String EnterData=	driver.findElement(By.xpath("//input[@id='identifierId']")).getAttribute("Value");
		System.out.println("EnterData :"+EnterData);
		if (EnterData.equals("RBG Technologies"))
		{
			System.out.println("EnterData isValidate");
		}
		else
		{
			System.out.println("EnterData is not Validate");
		}
		
	}
}