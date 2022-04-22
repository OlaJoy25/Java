import static org.junit.Assert.*;

import org.junit.Test;
public class MyJUnitTest {
	
	@Test
	public void testAddPass(){
		assertEquals("error in add()", 7, Calculator.add(4,3));
		assertEquals("error in add()", -4, Calculator.add(-2,-2));
		assertEquals("error in add()", 3.0, Calculator.add(1.5,1.5));


}
	@Test
	public void testAddFail() {
		assertNotEquals("error in add()", -4, Calculator.add(3,-2));
	}
	
	@Test
	public void testSubPass() {
		assertEquals("error in sub()", 5, Calculator.sub(6,1));
		assertEquals("error in sub()", -2, Calculator.sub(-3,-1));
		assertEquals("error in sub()", 0, Calculator.sub(4,4));
		
	}
	
	@Test
	public void testSubFail() {
		assertNotEquals("error in sub()", -4, Calculator.sub(-3,-2));
	}
	@Test
	public void testMulPass() {
		assertEquals("error in Mul()", 6, Calculator.Mul(2,3));
		assertEquals("error in Mul()", -4, Calculator.Mul(-2,2));
		assertEquals("error in Mul()", 0, Calculator.Mul(0,4));
		}
	@Test
	public void testMulFail() {
		assertNotEquals("error in Mul()", -8, Calculator.Mul(-3,-2));
	}
	@Test
	public void testDivPass() {
		assertEquals("error in Div()", 3, Calculator.Div(6,2));
		assertEquals("error in Div()", 4, Calculator.Div(8,2));
		}
	@Test
	public void testDivFail() {
		assertNotEquals("error in Div)", 4, Calculator.Div(6,3));

	}
}