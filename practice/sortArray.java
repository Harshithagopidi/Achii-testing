package practice;

import java.util.Arrays;

public class sortArray {

	public static void main(String[] args) {
		
		//sorting numbers
		int[] num = { 10,20,30,40};
		Arrays.sort(num);
		System.out.println("sorted numerical array"+ Arrays.toString(num));
		
		 //sorting string
		String[] name= { "saanvi","eshaan","sriyaan","arav","ruaansh"};
		Arrays.sort(name);
		System.out.println("sorted string array"+Arrays.toString(name));

	}

}
