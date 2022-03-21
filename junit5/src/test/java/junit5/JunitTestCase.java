package junit5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitTestCase {

	@Test
	void test() {
		System.out.println("inside the test");
	}
	@BeforeEach
	public void before() {
		System.out.println("Before every method....");
	}
	@AfterEach
	public void after() {
		System.out.println("after every method....");
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("after all the  methods....");
	}
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("before all the  methods....");
	}


}
