
import java.util.Random;

class Thread1{
	Random rand = new Random(10);
	 public int randomNumber() {
		return rand.nextInt((45 - 5) + 5) + 5;
	}
}

class Thread2 extends Thread{
	int num;
	Thread2(int num){
		this.num = num;
	}

	 public void run() {
	System.out.println("Generated Number : " + num );
	System.out.println("The thread " + num + " is EVEN and square of " + num + " is : " + num*num);
	System.out.println("--------------------------------------------------------------");
	}

}

class Thread3 extends Thread{
	int num;
	Thread3(int num){
		this.num = num;
	}
	
	 public void run() {
//		System.out.println("Square : " + num * num);
		System.out.println("The thread " + num + " is ODD and cube of " + num + " is : " + num*num*num);
	}
	
}


public class RandomThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 th1 = new Thread1();
		
		new Thread() {
			public void run() {
				for(int i=0; i<10; i++) {
					try {Thread.sleep(1000);}catch(Exception e) {}
					int num = th1.randomNumber();
					if(num%2==0) {
//						System.out.println(num);
						Thread2 th2 = new Thread2(num);
						th2.start();
					}
				}
			}
		}.start();
		


	}

}
