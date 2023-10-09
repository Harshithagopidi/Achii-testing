package practice;

import java.util.Scanner;

public class MultiplicationEx {

	public static void main(String[] args) {
		Scanner abc= new Scanner(System.in);
		System.out.println("enter a number: ");
		int number=abc.nextInt();
		System.out.println("multiplication table for:"+number+":");
		for(int i=1;i<=10;i++) {
			int val= number*i;
			System.out.println(number+ "x"+ i+ "="+ val);
		}
	}

}
