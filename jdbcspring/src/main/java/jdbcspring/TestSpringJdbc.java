package jdbcspring;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("unused")
public class TestSpringJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		PersonsDao dao = (PersonsDao) context.getBean("dao");
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter city");
		String city=sc.next();
		System.out.println("Enter state");
		String state=sc.next();
		System.out.println("Enter pid");
		int pid=sc.nextInt();
		Persons person = new Persons(name,city,state,pid);
		String result = dao.insertPerson(person);
		System.out.println(result);
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PID");
		int pid = sc.nextInt();
		List<Persons> person = dao.getDetails(pid);
		person.forEach(System.out::println);
		
		System.out.println("List of All Persons.");
		List<Persons> persons = dao.getAllPersons();
		persons.forEach(System.out::println);
		
		System.out.println("List of All Users.");
		List<Users> users = dao.getAllUsers();
		@SuppressWarnings("rawtypes")
		Iterator itr =  users.iterator();
		while(itr.hasNext())
		{
			Users u= (Users) itr.next();
			System.out.println(u.getUsername()+" "+u.getPassword()+" "+u.getRoles());
		}
		
		sc.close();
	}

}
