class Base {
	final int x=100;

	Base() {
		
	}

	public void show() {
		System.out.println("x = " + x);
	}
}

class Derived extends Base {
	int y;

	Derived() {
		y = 20;
	}

	public void show() {
		System.out.println("x = " + x + " y = " + y);
	}
}

public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived d = new Derived();
		d.show();
	}

}
