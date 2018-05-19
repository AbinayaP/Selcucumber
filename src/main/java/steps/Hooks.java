package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods{
	@Before
	public void before(Scenario SC) {
		startResult();
		startTestModule(SC.getName(), SC.getId());
		test = startTestCase(SC.getName());
		test.assignCategory(category);
		test.assignAuthor(authors);
		startApp("chrome");	
		
	}
@After
public void after() {
	closeAllBrowsers();
	endResult();
}
}
