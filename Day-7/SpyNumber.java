public class SpyNumber {
	public static void main(String[] args) {
		int no = 1124;
		int x = no;
		int r = 0;
		int temp = 0;
		int p = 1;
		while (no > 0) {
			r = no % 10;
			temp = temp + r;
			p = p * r;
			no = no / 10;

		}
		System.out.println("Entered Number is: " + x);
		if (temp == p) {
			System.out.println("The Number "+x+" is a spy number.");
		} else {
			System.out.println("The Number "+x+" is not a spy number.");
		}
	}
}
