package mypackage;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Reporting {
	

@Test
public void test_a() {
	
System.out.println("test passed");	
	
}

@Test
public void test_b() {
	
Assert.assertEquals("qwerty", "facs");
}
}
