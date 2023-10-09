package practice;

import java.io.InputStream;
import java.util.Scanner;

public class largenumb {

	public static void main(String[] args) {
    Scanner abc =  new Scanner(System.in);
  System.out.println("Enter the first value:");
  int n1= abc.nextInt();
  System.out.println("Enter the second value:");
  int n2= abc.nextInt();
  int val = (n1>n2) ? n1:n2;
  System.out.println("The largest number is:"+val);
 abc.close();
	}
	}


