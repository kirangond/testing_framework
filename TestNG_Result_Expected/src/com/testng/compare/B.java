package com.testng.compare;

import org.junit.Test;

import junit.framework.Assert;

//Using Junit annotation for comparing expected result same as testNg because testng built top on Junit
public class B {
	
	@Test
	public void test2()
	{
		AddTwoNumbers obj =  new AddTwoNumbers();
		int sum=obj.addTwoNumbers(20, 20);
		Assert.assertEquals(sum, 40);
	}

}
