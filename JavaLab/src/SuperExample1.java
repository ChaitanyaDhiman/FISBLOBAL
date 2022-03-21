class Person{
		int eid;
		String Name;
		Person(int eid,String Name){
			this.eid=eid;
			this.Name=Name;
		}
	}
	class Emp extends Person{
		float salary;
		Emp(int eid,String Name,float salary){
			super(eid,Name);
			this.salary=salary;
		}
		void display() {
			System.out.println("Employee ID : "+eid+" Name : "+Name + " Salary : "+salary);
		}
	}

public class SuperExample1 {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp(1,"Kumar",45000f);
		e1.display();

	}

}
