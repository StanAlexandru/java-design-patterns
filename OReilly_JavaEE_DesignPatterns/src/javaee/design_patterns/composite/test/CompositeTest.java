package javaee.design_patterns.composite.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import javaee.design_patterns.composite.Adder;
import javaee.design_patterns.composite.Constant;
import javaee.design_patterns.composite.Divider;
import javaee.design_patterns.composite.Expression;
import javaee.design_patterns.composite.Multiplier;
import javaee.design_patterns.composite.Subtracter;

public class CompositeTest {

	@Test
	public void testConstant() {
		double testValue = 3.0;
		Expression e = new Constant(testValue);
		assertEquals(testValue, e.getValue(), 0.0);
	}
	
	@Test
	public void testAdder() {
		double testValueA = 2.0;		
		double testValueB = 4.0;
		
		Expression left = new Constant(testValueA);
		Expression right = new Constant(testValueB);
		
		Expression e = new Adder(left, right);
		assertEquals(testValueA + testValueB, e.getValue(), 0.0);
	}
	
	@Test
	public void testSubtracter() {
		double testValueA = 2.0;		
		double testValueB = 4.0;
		
		Expression left = new Constant(testValueA);
		Expression right = new Constant(testValueB);
		
		Expression e = new Subtracter(left, right);
		assertEquals(testValueA - testValueB, e.getValue(), 0.0);
	}
	
	@Test
	public void testMultiplier() {
		double testValueA = 2.0;		
		double testValueB = 4.0;
		
		Expression left = new Constant(testValueA);
		Expression right = new Constant(testValueB);
		
		Expression e = new Multiplier(left, right);
		assertEquals(testValueA * testValueB, e.getValue(), 0.0);
	}
	
	@Test
	public void testDivider() {
		double testValueA = 2.0;		
		double testValueB = 4.0;
		
		Expression left = new Constant(testValueA);
		Expression right = new Constant(testValueB);
		
		Expression e = new Divider(left, right);
		assertEquals(testValueA / testValueB, e.getValue(), 0.0);
	}
	
	@Test
	/** ((3+5)*100)/(2+64) */	
	public void testComplexExpression() {

		Expression e = 
				new Divider(
						new Multiplier(
								new Adder(
										new Constant(3.0), 
										new Constant(5.0)), 
								new Constant(100.0)), 
						new Adder(
								new Constant(2.0), 
								new Constant(64.0)));
		assertEquals(
				12.12121212, 
				e.getValue(), 0.0001);
	}

}
