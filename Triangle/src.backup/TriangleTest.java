import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {

	private Triangle triangle;
	

	@Test
	public void testIsTriangle() {
		triangle = new Triangle(3,3,3);
		assertTrue(triangle.isTriangle(triangle));
		triangle = new Triangle(-1,-1,-2);
		assertFalse(triangle.isTriangle(triangle));
	}

	@Test
	public void testGetType() {
		triangle = new Triangle(1,1,2);
		assertEquals(new String("Illegal"), triangle.getType(triangle));
		triangle = new Triangle(3,3,3);
		assertEquals(new String("Regular"), triangle.getType(triangle));
		triangle = new Triangle(3,4,5);
		assertEquals(new String("Scalene"), triangle.getType(triangle));
		triangle = new Triangle(3,3,4);
		assertEquals(new String("Isosceles"), triangle.getType(triangle));
	}

	@Test
	public void testGetBorders() {
		triangle = new Triangle(3,3,3);
		long[] numbers = {3,3,3};
		assertArrayEquals(numbers, triangle.getBorders());
	}

}
