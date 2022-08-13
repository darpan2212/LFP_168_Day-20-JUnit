package com.bl.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTestDemo {

	String str1 = "Junit";
	String str2 = "Junit";
	Object obj1 = new Object();
	Object obj2 = new Object();
	String str5 = null;
	int var1 = 1;
	int var2 = 2;
	int[] arr1 = { 1, 2, 3 };
	int[] arr2 = { 1, 2, 3, 4 };

	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("------Before tests starts------");
	}
	

	@AfterClass
	public static void afterClassTest() {
		System.out.println("------After tests ends------");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("Before each test case start");
	}

	@After
	public void afterTest() {
		System.out.println("After each test case start");
	}
	
	@Test
	public void strEqualTest() {
		System.out.println("Test1");
		assertEquals(str1, str2);
	}

	@Test
	public void strSameTest() {
		System.out.println("Test2");
		assertSame(str1, str2);
	}

	@Test
	public void objSameTest() {
		System.out.println("Test3");
		assertSame(obj1, obj2);
	}

	@Test
	public void objNotSameTest() {
		System.out.println("Test4");
		assertNotSame(obj1, obj2);
	}

	@Test
	public void strNotNullTest() {
		System.out.println("Test5");
		assertNotNull(str5);
	}

	@Test
	public void strNullTest() {
		System.out.println("Test6");
		assertNull(str5);
	}

	@Test
	public void intMaxTest() {
		System.out.println("Test7");
		assertTrue(var1 < var2);
	}

	@Test
	public void intMinTest() {
		System.out.println("Test8");
		assertFalse(var1 > var2);
	}

	@Test
	public void arrayEqual() {
		System.out.println("Test9");
		assertArrayEquals(arr1, arr2);
	}

}