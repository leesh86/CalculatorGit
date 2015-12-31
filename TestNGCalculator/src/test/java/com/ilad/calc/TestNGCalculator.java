package com.ilad.calc;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

@Listeners(com.ilad.calc.MyITestListener.class)
public class TestNGCalculator {
	private Calculator c;
	
	@BeforeMethod(alwaysRun=true)
	public void setUp() {
		c = new Calculator();
	}
	
	@Test(groups = { "blabla" }, dataProvider = "test1")
	public void testAdd(int a, int b, int expected) {
		System.out.println("testAdd from within method");
		Assert.assertEquals(c.add(a,b), expected, "testAdd for " + a + " + " + b + " = fail");
		Reporter.log("testAdd for " + a + " + " + b + " = success", true);
		
	}
	
	@Test(dependsOnMethods = { "testMult" }, alwaysRun = true)
	public void testSub() {
		System.out.println("testSub");
		Assert.assertEquals(c.substract(3,2), 1);
	}
	
	@Test(groups = {"blabla"}, dependsOnMethods = { "testAdd" }, alwaysRun=true)
	public void testMult() {
		System.out.println("testMult");
		Assert.assertEquals(c.mult(2,3), 6);
	}
	
	//This method will provide data to any test method that declares that its Data Provider
	//is named "test1"
	@DataProvider(name = "test1")
	public Object[][] createData1(Method m) {
		System.out.println(m.getName() + " from dataProvider");
	 return new Object[][] {
	   {2, 3, 5 },
	   {2, 4, 6} };
	}

}
