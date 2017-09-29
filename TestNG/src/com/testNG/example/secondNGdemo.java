package com.testNG.example;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.internal.junit.*;

public class secondNGdemo {
	
	@Test
	public void firstTest() {
		System.out.println("1st test");
	}
	
	@Test(dependsOnMethods= {"firstTest"}, alwaysRun=true)
	public void secondTest() {
		System.out.println("2nd test");		
	}
	
//	@Test(timeOut=2000)
//	public void thirdtest() throws InterruptedException {
//		TimeUnit.SECONDS.sleep(1);
//		System.out.println("3rd test");
//	
//	@Test(enabled=false)
//	public void thirdTest() {
//		System.out.println("3rd test");		
	}


