
class Box2D{ 
	int length;
	int breadth;
	Box2D(){
		length=1;
		breadth=2;
	}
	
	public void calArea() {
		System.out.println("The area is : "+(length*breadth));
	}
}

class Box3D extends Box2D{  
	int height;
	Box3D(){
		height=3;
	}
	public void calVolume() {
		System.out.println("The volume is : "+(length*breadth*height));
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box3D b2 = new Box3D();
		b2.calArea();
		b2.calVolume();

	}

}
