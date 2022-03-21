package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Predicate;
public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p = n->n%2==0;
		Queue<Integer> q = new PriorityQueue<>();
		q.add(10);
		q.add(3);
		q.add(8);
		q.add(5);
		System.out.println(q);
		q.remove();
		System.out.println(q);
		
		Deque<Integer> dq = new ArrayDeque<>();
		
		dq.add(10);
		dq.add(3);
		dq.add(8);
		dq.add(5);
		System.out.println(dq);
		dq.addFirst(19);
		System.out.println(dq);
		dq.removeIf(p);
		System.out.println("After removing multiples of 2 ");
		System.out.println(dq);
		

	}

}