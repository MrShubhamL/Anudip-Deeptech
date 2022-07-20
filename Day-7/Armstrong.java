
public class Armstrong {
	public static int powerCal(int rem, int count) {
		int m = 1;
		for(int i=0; i<3; i++) {
			m = m * rem;
		}
		return m;
	}
	public static void main(String[] args) {
	       int a = 153;
	       
	       int x = a;
	        int r = 0;
	        int temp = 0;
	        int count = 0;
	        
	        while (a > 0)
	        {
	        	count++;
	            r = a % 10;
	            a = a/10;
	            temp = temp + powerCal(r, count);
	        }
	        if(x == temp) {
	        	System.out.println("Given number "+x+" is Armstrong number.");
	        }
	        else {
	        	System.out.println("Genven number "+x+"is Not Armstrong number.");
	        }
	}
}
