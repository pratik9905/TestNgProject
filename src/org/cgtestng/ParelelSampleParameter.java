package org.cgtestng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParelelSampleParameter {
	

	@Test
	@Parameters({"UserName", "Password"})
	public void param1(String name, String credentials) 
	{
		System.out.println("Param 1 "+Thread.currentThread().getId());
		System.out.println("User name is: " +name);
		System.out.println("Password value is: " +credentials);

	}
	
	
	@Test
	@Parameters({"User", "Password"})
	//Optional annotation parameter is when there is a mismatch of parameters
	public void param3(@Optional("Opt Name")String name, String credentials) 
	{
		System.out.println("Param 2 "+Thread.currentThread().getId());
		System.out.println("User name is: " +name);
		System.out.println("Password value is: " +credentials);

	}

}
