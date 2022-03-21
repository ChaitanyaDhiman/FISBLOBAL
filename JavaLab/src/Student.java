
public class Student {

	
		int Rollno;
		String Name;
		public Student(int Rollno,String Name) {
			super();
			this.Rollno = Rollno;
			this.Name = Name;
		}

        public void showData(Branch branch) {
        	System.out.println("ROLLNO :" + Rollno + "  NAME : " + Name);
        	System.out.println("BRANCH : " + branch.branch);
	 
        }

	

}
