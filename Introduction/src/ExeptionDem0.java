
public class ExeptionDem0 {
 
	
	public static void main(String[] args) 
	{
		int i=7;
		int c=0;
		try
		{
			
		
		//int k= i/c;
			int arr[]=new int[5];
		
			System.out.println(arr[6]);
		}
		catch(IndexOutOfBoundsException el)
		{
			System.out.println("gg");
		}
		catch(ArithmeticException e)
		{
			System.out.println("I catched Arthematic the error");
		}
		
		
	}

}

