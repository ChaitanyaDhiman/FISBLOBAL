package junit4;

import static org.junit.Assert.*;

import org.junit.Test;

@SuppressWarnings("unused")
public class TestMaths {

	@Test
	public void test() {
		Maths m = new Maths();
	    int ans = m.divide(40, 10);
	    System.out.println(ans);
	}

}
