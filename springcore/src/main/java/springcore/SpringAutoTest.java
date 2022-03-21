package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringAutoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext
		context = new ClassPathXmlApplicationContext("configs.xml");
		GeoMetry g = (GeoMetry) context.getBean("circle");
		System.out.println(g.getShape());

	}

}
