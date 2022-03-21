package junit5;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses(
		{Test1.class,
		 Test3.class
		 }
)
@ExcludeTags("SmokeTest")
public class TestSuiteExample {

}
