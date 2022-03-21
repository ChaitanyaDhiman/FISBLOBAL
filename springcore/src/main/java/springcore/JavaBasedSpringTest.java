package springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedSpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Address adr1 = (Address) context.getBean("adr");
		Address adr2 = context.getBean(Address.class);
		System.out.println(adr1.hashCode());
		System.out.println(adr2.hashCode());
		
		Engine g = context.getBean(Engine.class);
		g.setEno(1001);
		g.setFuel("Petrol");
		g.setNocl(4);
		System.out.println(g);

	}

}
