class Calculation{
	int a;
	int b;
	
	Calculation(){
		a = 1;
		b = 2;

	}
	public void calAddition() {
		System.out.println("Output : " + (a+b));
		
	}
}
class Subtraction extends Calculation{
	public void calSuntraction() {
		System.out.println("Output : " + (a-b));
	}
	
}
public class InheitanceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Subtraction S = new Subtraction();	
	S.calAddition();
	S.calSuntraction();
  
	}

}
