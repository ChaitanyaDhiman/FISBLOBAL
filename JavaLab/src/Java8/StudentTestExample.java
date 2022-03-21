package Java8;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;

class Student1{
	String name;
	String result;
	int marks;
	public Student1(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
		this.result=null;
	}
}

public class StudentTestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Student1> s = m->m.marks>50;
		
		Function<Student1,String> f = student->{
			String result=null;
			if( student.marks >=80)
				result="Distinction";
			else if(student.marks >=60 && student.marks <80)
				result="First class";
			else if(student.marks>50 && student.marks<60)
				 result = "Second Class";
			else
				result="Fail";
			return result;
		};
		
		Consumer<Student1> c1 = e1->{
			System.out.println("Name : "+e1.name);
			System.out.println("Marks : "+e1.marks);
			System.out.println("Result : "+e1.result);
		};
		
		Student1 S = new Student1("Kumar",53);
		
		if(s.test(S)) {
		
			S.result = f.apply(S);
			c1.accept(S);
		}
		

	}

}
