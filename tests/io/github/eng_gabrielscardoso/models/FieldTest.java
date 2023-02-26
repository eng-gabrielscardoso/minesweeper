package io.github.eng_gabrielscardoso.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FieldTest {

	private Field field;
	
	@BeforeEach
	void initField() {
		field = new Field(3, 3);
	}
	
	@Test
	void testIfIsAValidNeighbourDistance1Left() {
		Field neighbour = new Field(3, 2);
		
		boolean result = field.addNeighbour(neighbour);
		
		assertTrue(result);
	}

	@Test
	void testIfIsAValidNeighbourDistance1Right() {
		Field neighbour = new Field(3, 4);
		
		boolean result = field.addNeighbour(neighbour);
		
		assertTrue(result);
	}
	
	@Test
	void testIfIsAValidNeighbourDistance1Top() {
		Field neighbour = new Field(2, 2);
		
		boolean result = field.addNeighbour(neighbour);
		
		assertTrue(result);
	}
	
	@Test
	void testIfIsAValidNeighbourDistance1Bottom() {
		Field neighbour = new Field(4, 2);
		
		boolean result = field.addNeighbour(neighbour);
		
		assertTrue(result);
	}
	
	@Test
	void testIfIsAValidNeighbourDistance2TopLeft() {
		Field neighbour = new Field(2, 2);
		
		boolean result = field.addNeighbour(neighbour);
		
		assertTrue(result);
	}

	@Test
	void testIfIsAValidNeighbourDistance2TopRight() {
		Field neighbour = new Field(2, 4);
		
		boolean result = field.addNeighbour(neighbour);
		
		assertTrue(result);
	}
	
	@Test
	void testIfIsAValidNeighbourDistance2BottomLeft() {
		Field neighbour = new Field(4, 2);
		
		boolean result = field.addNeighbour(neighbour);
		
		assertTrue(result);
	}
	
	@Test
	void testIfIsAValidNeighbourDistance2BottomRight() {
		Field neighbour = new Field(4, 4);
		
		boolean result = field.addNeighbour(neighbour);
		
		assertTrue(result);
	}
	
	@Test
	void testIfIsAInvalidNeighbourDistance() {
		Field neighbour = new Field(3, 5);
		
		boolean result = field.addNeighbour(neighbour);
		
		assertFalse(result);
	}
}
