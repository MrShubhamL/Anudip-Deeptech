
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailValidation {
	static Pattern pt = Pattern.compile("[a-z]+[a-zA-Z0-9_.]+@[a-z.]+com");
	static Matcher matcher;

	public static void emailValidation(String email) {
		boolean b = false;
		matcher = pt.matcher(email);
		b = matcher.matches();
		if (b) {
			System.out.println("Status - Email is valid.");
		} else {
			System.out.println("Status - Email is Invalid!");
		}
	}

	public static void main(String[] args) {
		System.out.println("__________ Email Validation ___________");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Email : ");
		String email = sc.next();
		System.out.println("-------------------------------------");
		emailValidation(email);
		System.out.println("-------------------------------------");
	}

}
