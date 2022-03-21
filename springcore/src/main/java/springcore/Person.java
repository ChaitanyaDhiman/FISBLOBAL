package springcore;

public class Person {
	
	String sid;
	Address address;
	
	public Person(String sid, Address address) {
		super();
		this.sid = sid;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [sid=" + sid + ", address=" + address + "]";
	}
	

}
