package com.amazon.testng;

import org.testng.annotations.Test;
 
public class PriorityMethod {

@Test(priority=-10)
	public void test1() {
		System.out.println("test1");
	}
	
@Test(priority=-5)
public void test2() {
	System.out.println("test2");
}
@Test(priority=0)
public void test3() {
	System.out.println("test3");
}
@Test(priority=2)
public void test4() {
	System.out.println("test4");
}
@Test(priority=1)
public void test5() {
	System.out.println("test5");
}
@Test
public void test6() {
	System.out.println("no priority");
}
}
