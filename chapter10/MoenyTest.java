package chapter10;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoenyTest {

	@Test
	public void testMultiplication() {
		Money five = Money.dollar(5);
		assertEquals(five.times(2), Money.dollar(10));
		assertEquals(five.times(3), Money.dollar(15));
	}
	
	@Test
	public void testEquality(){
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.franc(6)));
		assertFalse(Money.dollar(5).equals(Money.franc(5)));
	}
	
	@Test
	public void testFrancMultiplication(){
		Money five = Money.franc(5);
		assertEquals(five.times(2), Money.franc(10));
		assertEquals(five.times(3), Money.franc(15));
	}
	
	@Test
	public void testCurrency(){
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}
	
}
