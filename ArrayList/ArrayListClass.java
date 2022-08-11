
import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		// Adding the elements
		list.add(23);
		list.add(43);
		list.add(16);
		list.add(87);
		list.add(55);
		list.add(12);
		
		// Retrieve the elements using for loop
		System.out.println("All Elements - " + list);
		
		// Removing the elements
		list.remove(3);
		list.remove(4);
		
		System.out.println("List after remove the elements - " + list);
		
		
		

	}

}
