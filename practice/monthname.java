package practice;

import java.util.Scanner;

public class monthname {

	public static void main(String[] args) {
		Scanner abc= new Scanner(System.in);
		System.out.println("enter the month number:");
		int num=abc.nextInt();
		String name = getname(num);
		if(name!=null) {
			System.out.println("the equivalent month name is:"+name);
				}
		else {
			System.out.println("invalid month number");
		}
	}

	private static String getname(int num) {
		switch(num) {
		case 1:
			return "january";
		case 2:
			return "feburary";
		case 3:
			return "march";
		case 4:
			return "april";
		case 5:
			return "may";
		case 6:
			return "june";
		case 7:
			return "july";
		case 8:
			return "august";
		case 9:
			return "september";
		case 10:
			return "october";
		case 11:
			return "november";
		case 12:
			return "december";
		default:
		    return null;
	}

}
}