package practice;

public class ArrayEx {

	public static void main(String[] args) {
		// printing the array values by using for loop
		
		int[] arr = {12,13,14,44}; // int values
		String[] str= {"suresh","selenium","project","training"};   // string values
		// for each loop for int array
		System.out.println("int array ");
		for(int n1:arr) {
			System.out.println(n1);
		}
		// for each loop for string array
		System.out.println("string array ");
		for(String s1: str) {
			System.out.println(s1);
		}

	}

}
