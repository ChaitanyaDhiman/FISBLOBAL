class GeoMetry extends Object{
	
	int dim1;
	int dim2;
	GeoMetry(){
		
		
	}
	public void calArea() {
		System.out.println("The area is not defined....");
	}
}

class Rectangle {
	Rectangle(){
	//	dim1=1;
		//dim2=2;
	}
	public void calArea() {
		System.out.println("The area of rectangle is : ");
	}
	
}

class Triangle extends GeoMetry{
		int dim1;
		int dim2;
	Triangle(){
		dim1=4;
		dim2=6;
	}
	public void calArea() {
		System.out.println("The area of triangle is : "+(0.5*super.dim1*super.dim2));  // 12,  0
	}
}
public class OverrideExample extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t = new Triangle();  // Triangle = Geometry + Triangle
		t.calArea();  // Method overriding.

	}

}
