
import java.util.ArrayList;
import java.util.List;

public class Greatest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(90);
		list.add(23);
		list.add(12);
		list.add(66);
		list.add(32);
		list.add(56);
		
		int a = list.get(0);
		int b = list.get(0);
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i)> a) {
				a = list.get(i);
			}
			else if(list.get(i)< b) {
				b = list.get(i);
			}
		}
		
		System.out.println("Greatest Number - " + a);
		System.out.println("Smallest Number - " + b);
	}

}
