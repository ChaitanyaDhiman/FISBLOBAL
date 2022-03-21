package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EngineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Engine e = (Engine)context.getBean("eng");
		System.out.println(e);
		
		Address a = (Address)context.getBean("addr");
		System.out.println(a);
	
	}

}
