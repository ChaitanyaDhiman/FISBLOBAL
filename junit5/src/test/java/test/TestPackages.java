package test;

import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({"packageA","junit5"})
@IncludePackages("packageA")
@ExcludeTags("SmokeTest")
public class TestPackages {

}
