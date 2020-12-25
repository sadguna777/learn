import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 
{
	@AfterTest
	public void lastExecution()
	{
		System.out.println("execute at last");
	}
	
	@Test
public void Demo()
{
	System.out.println("Hello");
	}

}
