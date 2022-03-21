package Streams;

import java.util.ArrayList;
import java.util.Comparator;

public class MinMaxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList<Integer>(); 
		l1.add(0); 
		l1.add(15); 
		l1.add(10); 
		l1.add(5); 
		l1.add(30); 
		l1.add(25); 
		l1.add(20); 
		System.out.println(l1);
		Comparator<Integer> comp=(i1,i2)->i1.compareTo(i2);
		Integer min=l1.stream().min(comp).get();
		System.out.println("Min:"+min); 
		Integer max=l1.stream().max(comp).get();
		System.out.println("Max:"+max); 
	}
}