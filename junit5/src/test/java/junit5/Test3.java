package junit5;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class Test3 {
	
	@Test
	@Tag("SmokeTest")
	void test8() {
		System.out.println("Inside test8");
	}
	@Test
	
	void test9() {
		System.out.println("Inside test9");
	}
	@Test
	void test10() {
		System.out.println("Inside test10");
	}

}
