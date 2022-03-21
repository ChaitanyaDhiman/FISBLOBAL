package example3;

import org.springframework.stereotype.Component;

@Component("ForAll")
public class UserAccessImpl implements UserAccess{
	
	@Override
	public String getAccessType() {
		return "It is accessable.";
	}

}
