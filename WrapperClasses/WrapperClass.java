//Autoboxing
class WrapperClass {
	public static void main(String[] args) {
		int a = 89;
		Integer integer = Integer.valueOf(a);
		System.out.println("Autoboxing : " + a + " " + integer);
		Unboxing.display();
	}

}

// Unboxing 
class Unboxing{
	static void display() {
		Integer i = new Integer(4);
		int a = i.intValue();
		System.out.println("Unboxing : " +  i + " " + a);
		
	}
}
