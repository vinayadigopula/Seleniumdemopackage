package collectionsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsandfindElementsDemo2 {

	public static void main(String[] args) 
	{
		 
			{
			WebDriver driver=new ChromeDriver();
								
				List<WebElement> list =driver.findElements(By.xpath("//input[@id='rbg']"));
				int size = list.size();
				System.out.println("size :"+size);
				System.out.println("Done");
			}

	}

}
