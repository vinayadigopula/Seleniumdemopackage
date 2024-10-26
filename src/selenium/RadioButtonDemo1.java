package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo1 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement RadioButtonDemo1=driver.findElement(By.xpath("//input[@value='oneway' and @name='tripType']"));

		boolean RadioButtonDisplay=RadioButtonDemo1.isDisplayed();
		System.out.println("RadioButtonDisplay :"+RadioButtonDisplay);
		if (RadioButtonDisplay==true)
		{
			System.out.println("RadioButton is Displaying");
		}

		else
		{
			System.out.println("RadioButton is not Displaying");
		}

		boolean RadioButtonEnabled=RadioButtonDemo1.isDisplayed();
		System.out.println("RadioButtonEnabled :"+RadioButtonEnabled);
		if (RadioButtonEnabled==true)
		{
			System.out.println("RadioButton is Enabled");
		}

		else
		{
			System.out.println("RadioButton is not Enabled");
		}

		boolean SelectRadioButton=RadioButtonDemo1.isSelected();
		System.out.println("SelectRadioButton :"+SelectRadioButton);
		if (SelectRadioButton==true)
		{
			System.out.println("RadioButton is Selected");
		}

		else
		{
			System.out.println("RadioButton is not Selected");
		}

		RadioButtonDemo1.click();

		boolean SelectRadioButton1=RadioButtonDemo1.isSelected();
		System.out.println("SelectRadioButton1 :"+SelectRadioButton1);
		if (SelectRadioButton1==true)
		{
			System.out.println("RadioButton is Selected");
		}
		else
		{
			System.out.println("RadioButton is not Selected");
		}


	}

}
