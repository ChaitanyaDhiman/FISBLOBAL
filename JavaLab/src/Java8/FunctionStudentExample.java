package Java8;
import java.util.Scanner;
import java.util.function.Function;

class Student{
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
}

public class FunctionStudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Student,String> f = student->{
			String result =null;
			if( student.marks >=80)
				result="Distinction";
			else if(student.marks >=60 && student.marks <80)
				result="First class";
			else if(student.marks>=30 && student.marks <60)
				result = "Pass";
			else
				result="Fail";
			return result;
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name..");
		String name = sc.nextLine();
		System.out.println("Enter the student marks");
		int marks = sc.nextInt();
		Student s = new Student(name,marks);
		System.out.println(f.apply(s));
		
		sc.close();

	}
	
	

}
