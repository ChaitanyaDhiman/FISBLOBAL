package Java8;

import java.util.function.Predicate;

public class PredicateCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p1 = n->n%2==0;
		Predicate<Integer> p2 = n->n>10;
		
		System.out.println(p1.and(p2).test(10));
		System.out.println(p1.or(p2).test(4));  
		
		System.out.println(p1.negate().test(8));// true

	}

}
