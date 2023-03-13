package com.masai.testAnnotation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestAnnotationDemo {

	@Test
	public void test()
	{
        //assertEquals(2, 2);  //expected, actual passed test
		assertEquals(3, 2);  //Failed test case
	}
}


//In JUnit5 we can remove visibility of class and method also i.e removing public keyword