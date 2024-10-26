package selenium;

import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class RadioButtonDemo2 
{

	public static void main(String[] args) 
	
	{
		WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	
	//RadioButtonDemo2 radioButton=new RadioButtonDemo2();

	List<WebElement> radioButtonsList = new ArrayList<WebElement>();

	System.out.println("isListEmpty: "+radioButtonsList.isEmpty());
	radioButtonsList.add(driver.findElement(By.xpath("//input[@name='tripType'][@value='roundtrip']")));
	radioButtonsList.add(driver.findElement(By.xpath("//input[@name='tripType'][@value='oneway']")));
	radioButtonsList.add(driver.findElement(By.xpath("//input[@name='servClass'][@value='Coach']")));
	radioButtonsList.add(driver.findElement(By.xpath("//input[@name='servClass'][@value='Business']")));
	radioButtonsList.add(driver.findElement(By.xpath("//input[@name='servClass'][@value='First']")));
	System.out.println("isListEmpty: "+radioButtonsList.isEmpty());
	System.out.println("totalRadioButtons: "+radioButtonsList.size());
	System.out.println("List of Elements: "+radioButtonsList);
	System.out.println("4th radio button: "+radioButtonsList.get(3));
	Thread.sleep(2500);
	radioButtonsList.get(3).click();
	System.out.println("isRadioButtonClicked: "+radioButtonsList.get(3).isSelected());
	
}


	
	
	}

