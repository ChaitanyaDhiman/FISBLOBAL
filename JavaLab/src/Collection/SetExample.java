package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> hs = new HashSet<String>();
		hs.add("India");
		hs.add("Japan");
		hs.add("China");
		hs.add("India");
		System.out.println(hs);
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("India");
		lhs.add("Japan");
		lhs.add("China");
		lhs.add("India");
		System.out.println(lhs);
		
		TreeSet<String> ts = new TreeSet<>();
		ts.add("India");
		ts.add("Japan");
		ts.add("China");
		ts.add("India");
		System.out.println(ts);

	}

}