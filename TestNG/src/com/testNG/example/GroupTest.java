package com.testNG.example;

import org.testng.annotations.Test;

public class GroupTest {

	@Test(groups={"group1"})
	public void firstGroup() {
		System.out.println("I am in first group");
	}
	
	@Test(groups={"group2"})
	public void secondGroup() {
		System.out.println("I am in second group");
	}
	
}
