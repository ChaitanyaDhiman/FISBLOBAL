package Java8;

@FunctionalInterface
interface Maths{
	public int Sum(int a, int b);
}

@FunctionalInterface
interface Circle{
	public double calArea(int radius);
}

public class TestMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cr = r->3.141*r*r;
		Maths M = (a,b)->a+b;
		
		System.out.println("Sum : " + M.Sum(15,23));
		System.out.println("Area : " + cr.calArea(8));
		
		Runnable mt = () -> { for(int i=0;i<5;i++)
			                     System.out.println(i);
		                    };
		                  
		Thread t = new Thread(mt);
		t.start();

	}

}
