package springunittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestMaths {

	@Test
	public void test() {
		Maths m = new Maths();
		assertEquals(30,m.add(10, 20));
	}

}
