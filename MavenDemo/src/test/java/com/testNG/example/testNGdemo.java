package com.testNG.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGdemo {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method test");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Before test");
	}
	
	@Test
	public void firsttest() {
		System.out.println("My first TestNG test");
	}
	
	@Test
	public void secondtest() {
		System.out.println("My second TestNG test");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method test");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("After test");
	}
}
