package example3;

import org.springframework.stereotype.Component;

@Component("Admin")
public class UserAccessImpl2 implements UserAccess{

	@Override
	public String getAccessType() {
        return "Access only for Admins.";
	}

}
