
package yaksha;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import yaksha.*;


import org.junit.jupiter.api.Test;



public class MainClassTest {
	
	
	@Test
	public void testSquareArea() throws IOException {
		

	//	assertEquals(25,new Square(5).getArea(),0);	
		TestUtils.yakshaAssert(TestUtils.currentTest(),  new Square(5).getArea()== 25 ?"true":"false", TestUtils.businessTestFile );
		
		
	}
	
	@Test
	public void testRectangleArea() throws IOException {
		
		//assertEquals(25,new Square(5).getArea(),0);
		//assertEquals(30 ,new Rectangle(6,5).getArea(),0);
		
		TestUtils.yakshaAssert(TestUtils.currentTest(), new Rectangle(6,5).getArea() == 30 ?"true":"false", TestUtils.businessTestFile );
		
			
	//	assertEquals(40.0, new Triangle(10,8).getArea(),0);
	//	assertEquals(952.0, new Triangle(56,34).getArea(),0);
	//	assertEquals(170.0, new Triangle(10,34).getArea(),0);
		
	}
	
	@Test
	public void testTriangleArea() throws IOException {
		
		TestUtils.yakshaAssert(TestUtils.currentTest(), (new Triangle(10,8).getArea() == 40 ) && ( new Triangle(56,34).getArea() == 952.0 ) ?"true":"false", TestUtils.businessTestFile );
		
		
	//	assertEquals(170.0, new Triangle(10,34).getArea(),0);
		
	}

}
