package Practice;

import org.testng.annotations.Test;

public class DemoTest {
	
	@Test(groups="regression")
	public void capTest()
	{
		System.out.println("Captain");
		System.out.println("Spiderman");
		System.out.println("Superman");
	}

}
