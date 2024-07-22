package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dummy {
	
	@Test
	public void test1()
	{
		System.out.println("From Test1 method");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("From BeforeTest method");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("From AfterTest method");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("From BeforeClass method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("From AfterClass method");
	}
	@Test
	public void test2()
	{
		System.out.println("From Test2 method");
	}
	
	@BeforeTest
	public void beforeTest1()
	{
		System.out.println("From BeforeTest1 method");
	}

	@AfterTest
	public void afterTest1()
	{
		System.out.println("From AfterTest1 method");
	}
}
