package Sadguna;

public class stringclassdemo {
	public static void main(String args[])
	{
		String a=" hello";
		System.out.println(a.charAt(2));
		System.out.println(a.substring(4));
		System.out.println(a.subSequence(3,5));
		System.out.println(a.concat("rahul"));
		System.out.println(a.length());
		
		System.out.println(a.toUpperCase());
		System.out.println(a.split("l"));
		System.out.println(a.replace("l","s"));
		
		
	}

}