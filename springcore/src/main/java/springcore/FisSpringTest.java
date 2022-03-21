package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FisSpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		GlobalPerson p = (GlobalPerson) context.getBean("gp");
		System.out.println(p);
		
	
	}

}
