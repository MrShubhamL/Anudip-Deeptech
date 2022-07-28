abstract class Marks {
	abstract float getPercentage();
}

class A extends Marks {
	private byte physics;
	private byte chemistry;
	private byte mathematics;

	public A(byte physics, byte chemistry, byte mathematics) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.mathematics = mathematics;
	}

	float getPercentage() {
		float result = (float)(physics + chemistry + mathematics)/300*100;
		return result;
	}

}

class B extends Marks {
	private byte physics;
	private byte chemistry;
	private byte mathematics;
	private byte biology;

	public B(byte physics, byte chemistry, byte mathematics, byte biology) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.mathematics = mathematics;
		this.biology = biology;
	}

	float getPercentage() {
		float result = (float)(physics + chemistry + mathematics + biology)/400*100;
		return result;
	}

}

class StudentResult {
	public static void main(String[] args) {
		A a = new A((byte)55,(byte)55,(byte)57);
		B b = new B((byte)95,(byte)75,(byte)97, (byte)86);
		
		System.out.println("Question: _______________________________________________________________________________________________________");
		System.out.println("We have to calculate the percentage of marks obtained in three subjects (each out of\r\n"
				+ "100) by student A and in four subjects (each out of 100) by student B. Create an abstract\r\n"
				+ "class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other\r\n"
				+ "classes 'A' and 'B' each having a method with the same name which returns the\r\n"
				+ "percentage of the students. The constructor of student A takes the marks in three\r\n"
				+ "subjects as its parameters and the marks in four subjects as its parameters for student\r\n"
				+ "B. Create an object for eac of the two classes and print the percentage of marks for both\r\n"
				+ "the students.");
		System.out.println("_______________________________________________________________________________________________________");
		System.out.println("Solution: ");
		
		System.out.println("Student A Result");
		System.out.println("Total Percentage: " + String.format("%.2f", a.getPercentage()) + "%");
		
		
		System.out.println("Student B Result");
		System.out.println("Total Percentage: " + String.format("%.2f", b.getPercentage()) + "%");

	}

}
