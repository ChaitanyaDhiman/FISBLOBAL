package Collection;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar1 = new ArrayList<String>(); 
		//LinkedList ar1 = new LinkedList();
		//ArrayList ar1 = new ArrayList();
		
		ar1.add("India");
		ar1.add("Japan");
		ar1.add("China");
		ar1.add("Nepal");
		ar1.add("Japan");
		System.out.println(ar1);
		ar1.add(null);
		System.out.println(ar1);
		
		

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("America");
		ar2.add("Autralia");
		ar2.add("Canada");
		
		ar1.addAll(ar2);  // ar1 =ar1+ar2
		
		System.out.println(ar1);
		
		
		ar1.remove(1);
		System.out.println(ar1);
		
		ar1.remove("America");
		System.out.println(ar1);

	}

}
