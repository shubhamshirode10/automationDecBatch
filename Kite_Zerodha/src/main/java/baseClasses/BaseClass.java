package baseClasses;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BaseClass {

	@Test
	public void tc01() {
		Reporter.log("test case 01");
	}
}
