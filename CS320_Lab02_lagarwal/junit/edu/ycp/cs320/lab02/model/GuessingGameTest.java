package edu.ycp.cs320.lab02.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02.model.GuessingGame;

public class GuessingGameTest {
	private GuessingGame model;
	
	@Before
	public void setUp() {
		model = new GuessingGame();
	}
	
	@Test
	public void testSetMin() {
		model.setMin(1);
		assertEquals(1, model.getMin());
	}
	@Test
	public void testSetMax() {
		model.setMax(100);
		assertEquals(100, model.getMax());
	}
	@Test
	public void testIsDone() {
		assertTrue(model.getMin()==model.getMax());
	}
	@Test
	public void testGetGuess() {
		model.setMax(5);
		model.setMin(1);
		assertEquals(3, model.getGuess());
	}
	@Test
	public void testIsLessThan() {
		model.setIsLessThan(3);
		assertEquals(2, model.getMax());
	}
	@Test
	public void testIsGreaterThan() {
		model.setIsGreaterThan(3);
		assertEquals(4, model.getMin());
	}
}
