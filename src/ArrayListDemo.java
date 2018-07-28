import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList <String> a= new  ArrayList <String>();
		
		a.add("Java");
		a.add("Automation");
		a.add("C");
		a.add("CRM");
		a.add("Pi");
		a.add("Java");
		//a.remove(3);
		
		//System.out.println(a.size());
		//System.out.println(a);
		
		//System.out.println(a.remove(2));
		System.out.println(a);
		
		System.out.println(a.contains("C"));
		System.out.println(a.indexOf("Pi"));
		
	}
}
