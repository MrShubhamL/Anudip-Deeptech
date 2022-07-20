
public class SpyNumber {
	public static void main(String[] args) {
		int no = 123;

		int r = 0;
		int temp = 0;
		int p = 1;
		while (no > 0) {
			r = no % 10;
			temp = temp + r;
			p = p * r;
			no = no / 10;

		}
		if (temp == p) {
			System.out.println("Number is a spy number.");
		} else {
			System.out.println("Number is not a spy number.");
		}
	}
}
