package springcore;

public class GlobalPerson {
	String name;
	FisAddress address;
	@Override
	public String toString() {
		return "GlobalPerson [name=" + name + ", address=" + address + "]";
	}
	public GlobalPerson() {
		
	}
	public GlobalPerson(String name, FisAddress address) {
		super();
		this.name = name;
		this.address = address;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public FisAddress getAddress() {
		return address;
	}
	public void setAddress(FisAddress address) {
		this.address = address;
	}
	

}
