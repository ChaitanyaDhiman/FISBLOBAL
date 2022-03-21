package springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SpringAuto {
	
	
	@Autowired
	@Qualifier("circle")
	private GeoMetry geo;
	
	public SpringAuto() {
		
	}
	
	public String getShape() {
		return geo.getShape();
	}

}
