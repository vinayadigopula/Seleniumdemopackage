package collectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 
{

	public static void main(String[] args) 
	{
		List<String> list=new ArrayList<String>();
		list.add("RBG technologies");
		list.add("Selenium");
		list.add("Java");
		
		int totalElements=list.size();
		System.out.println("totalElements  :"+totalElements);
		
		list.add("RBG technologies");
		list.add("Selenium");
		list.add("Java");
		list.add("API testing");
		 totalElements=list.size();
		 System.out.println("totalElements  :"+totalElements);

	}

}
