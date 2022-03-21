package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
	int htno;
	String name;
	public Student(int htno, String name) {
		super();
		this.htno = htno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [htno=" + htno + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}
	
}
class HtnoSort implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.htno > s2.htno)
			return -1;
		else if(s1.htno < s2.htno)
			return 1;
		else
			return 0;
	}
	
}
public class StudentSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1001,"Kumar");
		Student s2 = new Student(4519,"Sunil");
		Student s3 = new Student(2765,"Amar");
		List<Student> studs = new ArrayList<Student>();
		studs.add(s1);
		studs.add(s2);
		studs.add(s3);
		System.out.println("Before sorting..");
		System.out.println(studs);
		HtnoSort hst = new HtnoSort();
		Collections.sort(studs,hst);
		System.out.println("after sorting..");
		System.out.println(studs);
		

	}

}