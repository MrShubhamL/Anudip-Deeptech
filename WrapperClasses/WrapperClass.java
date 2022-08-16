
//Autoboxing
class WrapperClasses {
	public static void main(String[] args) {
		int a = 89;
		Integer integer = Integer.valueOf(a);
		System.out.println("Autoboxing (int to Integer): " + a + " " + integer);
		Unboxing.example1();
		
		boolean f = false;
		Boolean b = Boolean.valueOf(f);
		System.out.println("Autoboxing (boolean to Boolean): " + f + " " + b);
		Unboxing.example2();
		
		char c = 'A';
		Character ch = Character.valueOf(c);
		System.out.println("Autoboxing (char to Character): " + c + " " + ch);
		Unboxing.example3();
		
		byte bt = 127;
		Byte byt = Byte.valueOf(bt);
		System.out.println("Autoboxing (byte to Byte): " + bt + " " + byt);
		Unboxing.example4();
		
		short s = (short) 34564;
		Short sh = Short.valueOf(s);
		System.out.println("Autoboxing (short to Short): " + s + " " + sh);
		Unboxing.example5();
	}

}

// Unboxing 
class Unboxing{
	static void example1() {
		Integer i = new Integer(4);
		int a = i.intValue();
		System.out.println("Unboxing (Integer to int) : " +  i + " " + a);
		
	}
	
	static void example2() {
		Boolean b = new Boolean(true);
		boolean f = b.booleanValue();
		System.out.println("Unboxing (Boolean to boolean) : " + b + " " + f);
	}
	
	static void example3() {
		Character c = new Character('D');
		char ch = c.charValue();
		System.out.println("Unboxing (Character to char) : " + c + " " + ch);
	}
	
	static void example4() {
		Byte bt = new Byte((byte) -128);
		byte byt = bt.byteValue();
		System.out.println("Unboxing (Byte to byte) : " + bt + " " + byt);
	}
	
	static void example5() {
		Short st = new Short((short) 678);
		short s = st.shortValue();
		System.out.println("Unboxing (Short to short) : " + st + " " + s);
	}
}
