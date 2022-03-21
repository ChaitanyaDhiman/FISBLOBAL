package packageA;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Test1 {
	void test1() {
		System.out.println("Package A -Inside test1");
	}
	@Test
	void test2() {
		System.out.println("Package A - Inside test2");
	}
	@Test
	@Tag("SmokeTest")
	void test3() {
		System.out.println("Package A - Inside test3");
	}
	
}
