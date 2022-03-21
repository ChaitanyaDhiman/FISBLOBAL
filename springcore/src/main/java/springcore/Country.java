package springcore;

import java.util.Map;

public class Country {
	String name;
	//List<String> states;
	Map<String,String> states;
	
	public Map<String, String> getStates() {
		return states;
	}
	public void setStates(Map<String, String> states) {
		this.states = states;
	}
	public Country() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public List<String> getStates() {
		return states;
	}
	public void setStates(List<String> states) {
		this.states = states;
	}*/
	

}
