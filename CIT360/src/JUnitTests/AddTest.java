package JUnitTests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AddTest {

	@Test
	public void ArrayEqualsTest() {
		String[] Frank = {"car", "house"};
		String[] John = {"car", "house"};
		MyJUnitClass junit = new MyJUnitClass();
		int result = junit.add(100, 200);
		assertArrayEquals(Frank, John);
	}
	
	@Test
	public void EqualsTest() {
		MyJUnitClass junit = new MyJUnitClass();
		int result = junit.add(100, 200);
		assertEquals(300, result);
	}
	
	@Test
	public void FalseTest() {
		MyJUnitClass junit = new MyJUnitClass();
		int result = junit.add(100, 200);
		assertFalse(false);
	}
	
	@Test
	public void NotNullTest() {
		MyJUnitClass junit = new MyJUnitClass();
		int result = junit.add(100, 200);
		assertNotNull(result);
	}
	
	@Test
	public void NotSameTest() {
		MyJUnitClass junit = new MyJUnitClass();
		MyJUnitClass jlib = new MyJUnitClass();
		int result = junit.add(100, 200);
		assertNotSame(junit, jlib);
	}
	
	@Test
	public void NullTest() {
		MyJUnitClass junit = new MyJUnitClass();
		int result = junit.add(100, 200);
		assertNull(null);
	}
	
	@Test
	public void SameTest() {
		MyJUnitClass junit = new MyJUnitClass();
		MyJUnitClass jlib = junit;
		int result = junit.add(100, 200);
		assertSame(junit, jlib);
	}
	
	@Test
	public void TrueTest() {
		MyJUnitClass junit = new MyJUnitClass();
		int result = junit.add(100, 200);
		assertTrue(true);
	}

}

