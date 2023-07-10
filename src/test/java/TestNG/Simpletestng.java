package TestNG;

import org.testng.annotations.Test;

public class Simpletestng {

	
	@Test
	public void createContact()
	{
		System.out.println("contact is created");
	}
	@Test(dependsOnMethods = "createContact" )
	public void Modifycontact()
	{
		System.out.println("contact modified");
	}
	@Test(dependsOnMethods = "createContact" )
	public void deleteContact()
	{
		System.out.println("contact is deleetd");
	}
	
	
}
