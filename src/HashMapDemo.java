import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap <Integer,String> hm= new HashMap <Integer,String>();
		hm.put(0, "Hello");
		hm.put(1, "Hi");
		hm.put(2, "Test");
		hm.put(3, "Selenium");

		Set sm= hm.entrySet();
		Iterator  it= sm.iterator();
		//Key and value separate//
		while(it.hasNext()) 
		{
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}

}
