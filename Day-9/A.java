public class A {
	
	
	A(int a, int b){
		this(2,"B");
		System.out.println("Integer and Integer");
	}
	
	A(int a, String b){
		this("A","B");
		System.out.println("Integer and String");
	}
	
	A(String a, String b){
		this("A",10);
		System.out.println("String String");
	}
	
	A(String a, int b){
		System.out.println("String and Integer");
	}
	A(){
		this(2,6);
		System.out.println("No-Args Constructor");
		
	}
	
	
	public static void main(String[] args) {
		
		new A();
		
	}

}
