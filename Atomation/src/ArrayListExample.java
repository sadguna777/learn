import java.util.ArrayList;

public class ArrayListExample {
//can add duplicate values
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("Sadguna");
		a.add("Java");
		System.out.println(a);
		a.add(0, "Harry");
		System.out.println(a);
		/*
		 * System.out.println(a); a.remove(0); System.out.println(a);
		 * a.remove("Sadguna");
		 * 
		 * System.out.println(a); a.removeAll(c)
		 */
		System.out.println(a.get(2));
		System.out.println(a.contains("testing"));
		System.out.println(a.indexOf("Sadguna"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a.size());
	}

}
