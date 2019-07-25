package com.maven.testingDemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.*;

public class TestCalculator {
	Calculator obj;// = new Calculator();

	@Test
	public void testAdd() {
		assertEquals("Addition is not proper", 40, obj.add(20, 20));
		System.out.println("testAdd() checking");
		// assertE
	}

	@Before
	public void createObject() {
		obj = new Calculator();
		System.out.println("Object Created");
	}

	@After
	public void removeObject() {
		// obj = new Calculator();
		obj = null;
		System.out.println("Object dereferenced");
	}

	@Test
	public void testSub() {
		assertEquals("Substraction is not proper", 0, obj.sub(20, 20));
		System.out.println("testSub() checking");
		// assertE
	}

	@AfterClass
	public static void aa() {
		System.out.println("second");
	}

	@BeforeClass
	public static void ab() {
		System.out.println("first");

	}

	@Test
	public void testEqual() {
		assertTrue("a and b are not equal", obj.compare(20, 20));
	}

	@Test
	public void testNotEqual() {
		assertFalse("a and b are  equal", obj.compare(120, 20));
	}

}
