package practice;

public class practice01 {

	public static void main(String[] args) {
	int i= 2538;
	int output=reverseNumber(i);
	System.out.println(output);

	}

	private static int reverseNumber(int i) {
		int reversed =0;
		while(i!=0) {
			int digit= i%10;
			reversed = reversed*10+digit;
			i /=10;
		}
		return reversed;
	}

}
