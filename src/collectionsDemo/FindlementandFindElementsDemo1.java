package collectionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindlementandFindElementsDemo1 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		//driver.findElement(By.xpath("//input[@id='rbg']"));
		
		driver.findElements(By.xpath("//input[@id='rbg']"));
		System.out.println("Done");
	}

}
