package Collection;

import java.util.*;

public class StudentSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1001,"Kumar");
		Student s2 = new Student(4519,"Sunil");
		Student s3 = new Student(2765,"Amar");
		Set<Student> hs = new TreeSet<>();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		System.out.println(hs);

	}

}