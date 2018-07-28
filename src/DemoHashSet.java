import java.util.HashSet;
import java.util.Iterator;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs= new HashSet <String>();
		hs.add("Test1");
		hs.add("Test2");
		hs.add("Test3"); 	
		hs.add("Test4");
		hs.add("Test5");
		System.out.println(hs.isEmpty());
		System.out.println(hs.remove("Test2"));
		System.out.println(hs);
		
		
		Iterator <String>i= hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
