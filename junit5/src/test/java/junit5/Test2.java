package junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class Test2 {
	
	@Test
	public void  test7() {
	Exception e=assertThrows(ArithmeticException.class,()->{
			int a=10,b=10;
			System.out.println(a/b);
		});
	assertEquals("/ by zero",e.getMessage());
	}
	
	@Test
	void test5() {
		System.out.println("Inside test5");
	}
	@Test
	void test6() {
		System.out.println("Inside test6");
	}
	


}
