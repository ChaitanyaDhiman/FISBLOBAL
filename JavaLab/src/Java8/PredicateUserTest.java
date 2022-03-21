package Java8;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
	String uname;
	String passwd;
	public User(String uname, String passwd) {
		super();
		this.uname = uname;
		this.passwd = passwd;
	};
	
}


public class PredicateUserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<User> p1 = user-> user.uname.equals("admin") && user.passwd.equals("1234") ;
		Predicate<String> p2 = str -> str.charAt(0)=='k';
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name");
		String u = sc.nextLine();
		System.out.println("Enter password");
		String p = sc.nextLine();
		User user = new User(u,p);
		
		
		
		if(p1.test(user))
			System.out.println("Valid user");
		else
			System.out.println("Invalid user");
		
		System.out.println(p2.test("kamal"));
		
		sc.close();

	}

}
