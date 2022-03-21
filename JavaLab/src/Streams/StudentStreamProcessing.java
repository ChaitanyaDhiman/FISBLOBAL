package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
	
}

public class StudentStreamProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Student> p = stu -> stu.marks<60;
		Function<Student,Student> f= st -> {
				if(st.marks<60)
					st.marks+=5;
			return st;
		};
		
		Student s1 = new Student("Anil",60);
		Student s2 = new Student("Kishore",87);
		Student s3 = new Student("John",58);
		Student s4 =  new Student("Prakash",72);
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		System.out.println(students);
		
		@SuppressWarnings("rawtypes")
		Stream s = students.stream();
		@SuppressWarnings("unchecked")
		List<Student> result = (List<Student>) s.filter(p).map(f).collect(Collectors.toList());
		System.out.println(result);

	}

}