package second.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyNameTest {

	@Test
	public void test() {
		Junitlesson juni = new Junitlesson();
		assertEquals("Vani",juni.myname());
		System.out.println("Im in first test");
	}
	
	@Test
	public void secondtest() {
		Junitlesson juni = new Junitlesson();
		assertEquals("Vani",juni.myname());
		System.out.println("Im in second test");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("before method");
	}

	@After
	public void afterTest() {
		System.out.println("after method");
	}
	
	@BeforeClass
	public static void BeforeClassTest() {
		System.out.println("Before everyone");
	}
	
	@AfterClass
	public static void AfterClassTest() {
		System.out.println("After everyone");
	}
}
