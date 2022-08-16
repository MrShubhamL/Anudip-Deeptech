
//Autoboxing
public class WrapperClasses {
	public static void main(String[] args) {
		int a = 89;
		Integer integer = Integer.valueOf(a);
		System.out.println("Autoboxing (int to Integer): " + a + " " + integer);
		Unboxing.example1();
		
		boolean f = false;
		Boolean b = Boolean.valueOf(f);
		System.out.println("Autoboxing (boolean to Boolean): " + f + " " + b);
		Unboxing.example2();
	}

}

// Unboxing 
class Unboxing{
	static void example1() {
		@SuppressWarnings("removal")
		Integer i = new Integer(4);
		int a = i.intValue();
		System.out.println("Unboxing (Integer to int) : " +  i + " " + a);
		
	}
	
	static void example2() {
		Boolean b = new Boolean(true);
		boolean f = b.booleanValue();
		System.out.println("Unboxing (Boolean to boolean) : " + b + " " + f);
	}
}
