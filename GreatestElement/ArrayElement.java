
public class ArrayElement {

	public static void main(String[] args) {
		int[] no = {45,7,87,3,576,6};
		
		int smallest = no[0];
		int greatest = no[0];
		
		for(int i = 0; i<no.length; i++ ) {
			if(no[i]>greatest) {
				greatest = no[i];
			}
			else if(no[i]<smallest){
				smallest = no[i];
			}
		}
		System.out.println("Smallest element from array - " + smallest);
		System.out.println("Greatest element from array - " +greatest);

	}

}
