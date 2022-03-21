package springcore;

import org.springframework.stereotype.Component;

@Component(value="circle")
public class Circle implements GeoMetry{

	public String getShape() {
		// TODO Auto-generated method stub
		return "Shape of Object is Circle";
	}

}
