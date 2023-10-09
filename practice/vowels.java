package practice;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
          int vowels =0 ;
            System.out.println( "give input");
            char ch= abc.next().charAt(0);
        switch(Character.toLowerCase(ch)) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        	System.out.println(ch+"is a vowel");
        break;
        default:
             System.out.println(ch+"is a constant");
        }
       
		abc.close();

}
}
