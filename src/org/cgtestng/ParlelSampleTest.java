package org.cgtestng;

import org.testng.annotations.Test;

public class ParlelSampleTest {
	
	@Test  
	public void sample1() {
		
		System.out.println("SampleTest case 1 "+Thread.currentThread().getId());
	}
	
	@Test 
	public void sample2() {
		
		System.out.println("SampleTest case 2 "+Thread.currentThread().getId());
	}
	
	@Test 
	public void sample3() {
		
		System.out.println("SampleTest case 3 "+Thread.currentThread().getId());
	}
	
	@Test  
	public void sample4() {
	
		System.out.println("SampleTest case 4 "+Thread.currentThread().getId());
	}
	
	@Test  
	public void sample5() {
		
		System.out.println("SampleTest case 5 "+Thread.currentThread().getId());
	}
	

}
