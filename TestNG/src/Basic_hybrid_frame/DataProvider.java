package Basic_hybrid_frame;

public class DataProvider 
{
	@org.testng.annotations.DataProvider(name="signupdata")
	public String[][] signdata()
	{
		String[][] arr= {{"Nikhil v","nikhi","nikhi@gmail.com","nikhi5@","nikhi5@"}};
		return arr;
	}

}
