package samplepkg1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.adacitin.commonutil.CommonUtill;

public class SampleProgram extends CommonUtill{
	@BeforeClass
	public static void beforeclass() throws Exception {
		SampleProgram sp = new SampleProgram();
		sp.browserlaunch("chrome");
		//sp.browserlaunch("FireFox");
		sp.browserMaximize();
		sp.methodWait();
	}

	@Before
	public void before() {
		SampleProgram sp = new SampleProgram();
		sp.loadUrl("https://adactinhotelapp.com/");
		sp.methodWait();
	}
	@After
	public void after() {
		SampleProgram sp = new SampleProgram();
		sp.elementClick(elementFinder(locaterfindByname("login")));
	}
	@AfterClass
	public static void afterclass() {
		SampleProgram sp = new SampleProgram();
		sp.methodWait();
		sp.methodclose();
	}
	@Test
	public void execution() {
		SampleProgram sp = new SampleProgram();
		sp.type(elementFinder(locatorFinderById("username")), "kamali");
		sp.type(elementFinder(locatorFinderById("password")), "kamali123");
	}
	@Test
	public void execution1() {
		SampleProgram sp = new SampleProgram();
		sp.type(elementFinder(locatorFinderById("username")), "sowmiya");
		sp.type(elementFinder(locatorFinderById("password")), "sowmi123");
	}
}
