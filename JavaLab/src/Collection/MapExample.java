package Collection;

import java.util.*;
//import java.util.Map.Entry;
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> m = new HashMap<>();
		m.put(1001, "India");
		m.put(4005, "Japan");
		m.put(2857, "Nepal");
		System.out.println(m);
		m.putIfAbsent(1001, "America");
		System.out.println(m);
		
		m.remove(2857,"Nepa");
		System.out.println(m);
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		if(m.containsKey(2856))
			System.out.println("Key is found");
		else
			System.out.println("Key not found");
		
		if(m.containsValue("India"))
			System.out.println("value is found");
		else
			System.out.println("value not found");
		
		System.out.println("The iteration of map is ");
		Set<?> set=m.entrySet();//Converting to Set so that we can traverse  
	    Iterator<?> itr=set.iterator();  
	    while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        @SuppressWarnings("rawtypes")
			Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    } 
		
		
		
	}

}