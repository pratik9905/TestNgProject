package org.cgtestng;

import org.testng.annotations.Test;

public class SampleTestPriority {
	
	@Test  (priority=-1)
	public void sample1() {
		
		System.out.println("SampleTest case 1");
	}
	
	@Test  (priority=0, invocationCount=3)
	public void sample2() {
		
		System.out.println("SampleTest case 2");
	}
	
	@Test  (enabled=false)
	public void sample3() {
		
		System.out.println("SampleTest case 3");
	}
	
	@Test  (priority=-1)
	public void sample4() {
	
		System.out.println("SampleTest case 4");
	}
	
	@Test  (priority=1)
	public void sample5() {
		
		System.out.println("SampleTest case 5");
	}
	
	

}
	
