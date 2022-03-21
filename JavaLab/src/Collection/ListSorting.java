package Collection;

import java.util.Collections;
//import java.util.Comparator;
import java.util.LinkedList;
/*
class MySort implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}
	
}
*/
// (s1,s2)->-s1.compareTo(s2);

public class ListSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ar1 = new LinkedList<String>();
		ar1.add("India");
		ar1.add("Japan");
		ar1.add("China");
		ar1.add("Nepal");
		System.out.println(ar1);
		
		Collections.sort(ar1);
		System.out.println("After sorting");
		System.out.println(ar1);
	//	MySort m = new MySort();
		// Collections.sort(collObject)
		// Collections.sort(collObject, ComparatorObject)
		Collections.sort(ar1,(s1,s2)->-s1.compareTo(s2));
		System.out.println("Reverse sorted order is :");
		System.out.println(ar1);
		

	}

}