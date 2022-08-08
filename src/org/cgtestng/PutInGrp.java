package org.cgtestng;

import org.testng.annotations.Test;

import graphql.Assert;



public class PutInGrp {

	
	@Test (groups = "Regression") 
	public void sample1() {
		
		System.out.println("SampleTest case 1 "+Thread.currentThread().getId());
	}
	
	
	@Test (groups = "Sanity") 
	public void sample2() {
		
		System.out.println("SampleTest case 2 "+Thread.currentThread().getId());
	}
	
	
	@Test (groups = {"Regression", "Sanity"}) 
	public void sample3() {
		
		System.out.println("SampleTest case 3 "+Thread.currentThread().getId());
		Assert.assertTrue(false);
	}
	
	
	@Test  (groups = "Sanity") 
	public void sample4() {
	
		System.out.println("SampleTest case 4 "+Thread.currentThread().getId());
	}
	
	
	@Test  (groups = "Regression") 
	public void sample5() {
		
		System.out.println("SampleTest case 5 "+Thread.currentThread().getId());
	}
	
}
