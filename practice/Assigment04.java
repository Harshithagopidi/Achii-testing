package practice;

import java.util.Scanner;

public class Assigment04 {

	public static void main(String[] args) {
		int evensum=0,oddsum=0,evenavg=0, oddavg=0,evencount=0,oddcount=0;
		Scanner abc = new Scanner(System.in);
		System.out.println("give the size ");
		int a=abc.nextInt();
		 int arr[]=new int[a];
		 System.out.println("enter the numbers");
		 for(int i=0;i<=a;i++) {
			 arr[i]=abc.nextInt(); 
		 }
		 for(int i =0;i<=a;i++) {
			 if(arr[i]%2==0) {
				 evensum= evensum+arr[i];
				 evencount++;
			 }
			 else {
				 oddsum=oddsum+arr[i];
				 oddcount++;
			 }
		 }
			 System.out.println("sumof the even numbers:"+ evensum);
			 System.out.println("sum of the odd numbers:"+oddsum);
		
		}

	}


