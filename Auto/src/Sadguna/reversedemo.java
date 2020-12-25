package Sadguna;

public class reversedemo {
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="sadguna";
		String t="";
		for(int i=s.length()-1;i>=0;i--)
		{
			t=t+s.charAt(i);
		}
		if(s==t)
		{
			System.out.println("Palindrome");
		}
			else
			System.out.print("not");
		}

	}


