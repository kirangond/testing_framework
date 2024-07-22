package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A {
	
	@Test
	public void test1()
	{
		System.out.println("print test1 result");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("From beforeTest");
	}
	
	@BeforeClass
	public  void beforeClass()
	{
		System.out.println("Before Class");
	}
    
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest");
	}
	
	@AfterClass  //static method not required for class annotation but in junit requied
	public  void afterClass()
	{
		System.out.println("After Class");
	}
   
	@Test
	public void test2()
	{
		System.out.println("print test2 result");
	}
}
