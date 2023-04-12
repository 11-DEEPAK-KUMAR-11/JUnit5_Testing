# JUnit5_Testing
## Java provides a framework called JUnit to perform the unit testing of our Java code. In the development of test-driven development.

It is an open-source testing framework for java programmers. The java programmer can create test cases and test his/her own code.

It is one of the unit testing framework. Current version is junit 4.

To perform unit testing, we need to create test cases. The unit test case is a code which ensures that the program logic works as expected.

The org.junit package contains many interfaces and classes for junit testing such as Assert, Test, Before, After etc.

### Types of unit testing
There are two ways to perform unit testing: 1) manual testing 2) automated testing.

1) Manual Testing
If you execute the test cases manually without any tool support, it is known as manual testing. It is time consuming and less reliable.

2) Automated Testing
If you execute the test cases by tool support, it is known as automated testing. It is fast and more reliable.

### Annotations for Junit testing
The Junit 4.x framework is annotation based, so let's see the annotations that can be used while writing the test cases.

@Test annotation specifies that method is the test method.

@Test(timeout=1000) annotation specifies that method will be failed if it takes longer than 1000 milliseconds (1 second).

@BeforeClass annotation specifies that method will be invoked only once, before starting all the tests.


@Before annotation specifies that method will be invoked before each test.

@After annotation specifies that method will be invoked after each test.

@AfterClass annotation specifies that method will be invoked only once, after finishing all the tests.


### Assert class
The org.junit.Assert class provides methods to assert the program logic.

### Methods of Assert class
The common methods of Assert class are as follows:


void assertEquals(boolean expected,boolean actual): checks that two primitives/objects are equal. It is overloaded.
void assertTrue(boolean condition): checks that a condition is true.
void assertFalse(boolean condition): checks that a condition is false.
void assertNull(Object obj): checks that object is null.
void assertNotNull(Object obj): checks that object is not null.
