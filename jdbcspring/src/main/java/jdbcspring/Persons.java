package jdbcspring;

public class Persons {
	private String name;
	private String city;
	private String state;
	private int pid;
	public Persons() {
		
	}
	public Persons(String name, String city, String state, int pid) {
		super();
		this.name = name;
		this.city = city;
		this.state = state;
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Persons [name=" + name + ", city=" + city + 
				", state=" + state + ", pid=" + pid + "]";
	}
	
	
}
