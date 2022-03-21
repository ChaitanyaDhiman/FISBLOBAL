package example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AccessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = 
		new AnnotationConfigApplicationContext(UserAccessConfig.class);
		TestUserAccessImpl tst= context.getBean(TestUserAccessImpl.class);
		String result = tst.getUserAccessDetails();
		System.out.println(result);

	}

}
