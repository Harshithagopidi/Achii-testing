package practice;

import java.util.Scanner;

public class vowels02 {

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		System.out.println("enter a character");
		char ch = abc.next().charAt(0);
		if(character(ch)) {
			if(isvowel(ch)) {
				System.out.println("entered character is a vowel");
			}
			else {
				System.out.println("entered character is a consonant.");
			}
		} else {
				System.out.println("invalid input");
			}	
		}
	public static boolean character(char ch) {
		return (ch>='a'&& ch<='z'|| ch>='A'&&ch<='Z');
	}
    public static boolean isvowel(char ch) {
		char lowerch = Character.toLowerCase(ch);
		return lowerch == 'a'|| lowerch =='e'|| lowerch == 'i' || lowerch =='o'|| lowerch=='u';
	}
}
