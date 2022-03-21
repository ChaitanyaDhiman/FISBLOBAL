package example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestUserAccessImpl {
		
		@Autowired
		@Qualifier("Admin")
		UserAccess access;
		
		public String getUserAccessDetails() {
			return access.getAccessType();
		}

	

}
