package practice;

public class aasignment01 {
   // fibonacci 
	public static void main(String[] args) {
		int a= 100;
		int b= 0; // previous
		int c=1;  // current
		System.out.println("fibonacci series");
		System.out.println(b+" ");
		while(c<=a) {
			System.out.println(c+" ");
			int next = b+c;
			b=c;
			c=next;
			
		}
	}

}
