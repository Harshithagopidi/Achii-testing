package practice;

import java.util.Scanner;

public class lastDigit {
	
	public int last(int num) {
		int mno= num%10;
		return mno;
	}
	
	public static void main(String[] args) {
		lastDigit xyz = new lastDigit();
		int res=xyz.last(1234556);
		System.out.println(res); 
		
		Scanner abc = new Scanner(System.in);
		System.out.println("enter a number: ");
	    int n = abc.nextInt();
		int lastnumb = n % 10;
		System.out.println("the last digit is: "+ lastnumb);
        abc.close();   
	}
}
