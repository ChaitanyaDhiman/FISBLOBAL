package examples2;

import org.springframework.stereotype.Component;

@Component("paid")
public class UserServiceImpl2 implements UserService{

	@Override
	public String getServiceType() {
		// TODO Auto-generated method stub
		return "It is a paid service";
	}

}
