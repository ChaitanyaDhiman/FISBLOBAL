class getType{
	public void type(int a) {
		System.out.println("Inside Single Integer Parameter.");
	}
	public void type(int a,int b) {
		System.out.println("Inside Double Integer Parameter.");
	}
	public void type(String a) {
		System.out.println("Inside Single String Parameter.");
	}
}
public class OverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getType T = new getType();
		
		T.type(1);
		T.type(1,2);
		T.type("Chaitanya");

	}
	

}
