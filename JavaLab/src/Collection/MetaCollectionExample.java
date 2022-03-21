package Collection;

import java.util.*;
import java.util.HashMap;
public class MetaCollectionExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    @SuppressWarnings("rawtypes")
			Map<String,List> dists = new HashMap();
			List<String> dist1 = new ArrayList<String>();
			dist1.add("adl");
			dist1.add("rr");
			dist1.add("ngl");
			
			List<String> dist2 = new ArrayList<String>();
			dist2.add("Mandya");
			dist2.add("kolar");
			dist2.add("Hubli");
			
			dists.put("TS", dist1);
			dists.put("KA", dist2);
			
			System.out.println(dists);
			
			@SuppressWarnings("rawtypes")
			Set set=dists.entrySet();//Converting to Set so that we can traverse  
		    @SuppressWarnings("rawtypes")
			Iterator itr=set.iterator();  
		    while(itr.hasNext()){  
		        //Converting to Map.Entry so that we can get key and value separately  
		        @SuppressWarnings("rawtypes")
				Map.Entry entry=(Map.Entry)itr.next();  
		       
		        System.out.println(entry.getKey());
		        System.out.println("The districts are: ");
		        List<String> temps = (List<String>) entry.getValue();  
		        temps.forEach(System.out::println);
		        
		    
		    } 
		   /* Iterator itr1 = set.iterator();
		    while(itr1.hasNext()) {
		    	Map.Entry e = (Map.Entry)itr1.next();
		    	
		    	dist1.containsValue("a");
		    	System.out.println(e.getValue());
		    	dist2.containsValue("a");
		    }*/
			
			

	}

}