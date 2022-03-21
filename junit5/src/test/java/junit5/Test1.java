package junit5;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class Test1 {

	@Test
	@Tag("SmokeTest")
	void test1() {
		System.out.println("Inside test1");
	}
	@Test
	void test2() {
		System.out.println("Inside test2");
	}
	@Test
	@Tag("SmokeTest")
	void test3() {
		System.out.println("Inside test3");
	}
	

}
