import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> test = new ArrayList <String>();
		
		test.add("Pen");
		test.add("pencil");
		test.add("rubber");
		
		//System.out.println(test.size());
		
		//System.out.println("The item in 3rd list is:" +test.get(2));
		
		for(int i=0;i<test.size();i++) {
			
			System.out.println("Element in the lists are:"+ test.get(i));
		}
		
		System.out.println("\nNext loop Example");
		
		for(String tes:test) {
			System.out.println("The item is "+tes);
		}

		test.remove(test.size()-1);
		System.out.println("Item removed is" +test.remove(test.size()-1));
		
	
	System.out.println("\nNext loop  after remove");
	
		for(String tes:test) {
		System.out.println("Item after removed "+tes);
	}
}
}
