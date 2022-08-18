
class SynchronizedClass{
	synchronized void primeNumber() {
		int c;
		System.out.println("-------------- Prime Numbers ------------------");
		for(int i=2; i<20; i++) {
			try {Thread.sleep(1000);}catch(Exception e) {}
			c = 0;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					c++;
					continue;
				}
			}
			if(c == 0) {
				System.out.println(i);
			}
		}
	}
	
	synchronized void table() {
		System.out.println("-------------- Table of 11 ------------------");
		for(int i=1; i<=10; i++) {
			try {Thread.sleep(1000);}catch(Exception e) {}
			System.out.println("11 x " + i + " = " + i*11);
		}
	}
	
	synchronized void series() {
		int n = 3;
		System.out.println("-------------- Number sequence ------------------");
		for(int i=1; i<=6; i++) {
			try {Thread.sleep(1000);}catch(Exception e) {}
			n = n * i;
			System.out.println(n);
		}
	}
}

class Thread1 extends Thread{
	SynchronizedClass sync;
	Thread1(SynchronizedClass sync){
		this.sync = sync;
	}
	
	public void run() {
		sync.primeNumber();
	}
}

class Thread2 extends Thread{
	SynchronizedClass sync;
	Thread2(SynchronizedClass sync){
		this.sync = sync;
	}
	
	public void run() {
		sync.table();
	}
}

class Thread3 extends Thread{
	SynchronizedClass sync;
	Thread3(SynchronizedClass sync){
		this.sync = sync;
	}
	
	public void run() {
		sync.series();
	}
}


public class Demo {
	public static void main(String[] args) {
		SynchronizedClass sync = new SynchronizedClass();
		Thread1 t1 = new Thread1(sync);
		Thread2 t2 = new Thread2(sync);
		Thread3 t3 = new Thread3(sync);
		t1.setPriority(10);
		t2.setPriority(9);
		t3.setPriority(8);
		t1.start();
		t2.start();
		t3.start();
		
	}

}
