package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo2a 
{

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/mortgage-calculator.html");
		WebElement CheckBoxDemo1=driver.findElement(By.xpath("//*[@id='caddoptional']"));

		boolean CheckBoxDisplay=CheckBoxDemo1.isDisplayed();
		System.out.println("CheckBoxDisplay :"+CheckBoxDisplay);
		if (CheckBoxDisplay==true)
		{
			System.out.println("CheckBox is Displaying");
		}

		else
		{
			System.out.println("CheckBox is not Displaying");
		}

		boolean CheckBoxEnabled=CheckBoxDemo1.isEnabled();
		System.out.println("CheckBoxEnabled :"+CheckBoxEnabled);
		if (CheckBoxEnabled==true)
		{
			System.out.println("CheckBox is Enabled");
		}

		else
		{
			System.out.println("CheckBox is not Enabled");
		}

		boolean SelectCheckBox=CheckBoxDemo1.isSelected();
		System.out.println("SelectCheckBox :"+SelectCheckBox);
		if (SelectCheckBox==true)
		{
			System.out.println("SelectCheckBox is Selected");
		}

		else
		{
			System.out.println("SelectCheckBox is not Selected");
		}

		CheckBoxDemo1.click();

		boolean SelectCheckBox1=CheckBoxDemo1.isSelected();
		System.out.println("SelectCheckBox1 :"+SelectCheckBox1);
		if (SelectCheckBox1==true)
		{
			System.out.println("SelectCheckBox is Selected");
		}

		else
		{
			System.out.println("SelectCheckBox is not Selected");
		}




	}







	}


