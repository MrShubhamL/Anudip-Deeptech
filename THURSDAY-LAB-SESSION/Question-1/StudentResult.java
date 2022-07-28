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
		
		System.out.println("Student A Result");
		System.out.println("Total Percentage: " + String.format("%.2f", a.getPercentage()) + "%");
		
		
		System.out.println("Student B Result");
		System.out.println("Total Percentage: " + String.format("%.2f", b.getPercentage()) + "%");

	}

}
