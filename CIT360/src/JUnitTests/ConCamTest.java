package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConCamTest {

	@Test
	public void Concattest() {
		MyJUnitClass junit = new MyJUnitClass();
		String result = junit.ConCat("Hello", "World");
		assertEquals("HelloWorld", result);
	}

}
