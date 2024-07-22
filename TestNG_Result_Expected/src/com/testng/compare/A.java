package com.testng.compare;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
	
	@Test
	public void test1()
	{
		//To call method of other class we need to create object of that class first.
		AddTwoNumbers obj = new AddTwoNumbers();
		int result = obj.addTwoNumbers(10,20);
	// It will compare the result i.e actual value and 30 is expected value
	//	Assert.assertEquals(result, 30);
		
		Assert.assertEquals(result, 20);
		
	}

}
