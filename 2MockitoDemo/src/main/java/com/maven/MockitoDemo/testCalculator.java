package com.maven.MockitoDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import junit.framework.Assert;

public class testCalculator {

	Calculator c1 = null;
	CalculatorService cs = Mockito.mock(CalculatorService.class);
	@Test
	public void testOperation() 
	{
	  //  AssertT
		//assertTrue(message, condition);
		assertEquals(0,c1.performCaculation(cs));
	//	assertEquals(10, performCalculation(cs));
		System.out.println("Tested Operation");

	}
	@Before
	public void createObject() {
		c1 = new Calculator();
		//cs = new CalculatorService() ;
		System.out.println("Object Created");
	}
	@After
	public void removeObject() {
		c1 = null;
		System.out.println("Object Removed");
	}

}
