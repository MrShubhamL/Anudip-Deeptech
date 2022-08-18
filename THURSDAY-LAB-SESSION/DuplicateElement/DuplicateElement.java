
import java.util.ArrayList;
import java.util.List;

public class DuplicateElement {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Rohan");
		list.add("Karan");
		list.add("Gourav");
		list.add("Shubham");
		list.add("Shubham");
		list.add("Rohan");
		list.add("Karan");
		list.add("Soham");
		
		System.out.println("List containing duplicate elements - " + list);
		List<String> list2 = new ArrayList<>();	
		for(String ele:list) {
			if(!list2.contains(ele)) {
				list2.add(ele);
			}
		}
		System.out.println("List of elements after removed duplicates - " + list2);
	}

}
