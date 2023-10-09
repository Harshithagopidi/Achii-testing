package practice;

import org.bouncycastle.est.ESTSourceConnectionListener;

public class stringclass {

	public static void main(String[] args) {
		String abc = "harshitha";
		System.out.println(abc.length());                        // to find the length of variable
		System.out.println(abc.charAt(3));                      //to find specific character , starts with zero
		System.out.println(abc.indexOf("h"));                  //finding index ,starts with zero
		String xyz = "REDDY";
		System.out.println(xyz.toLowerCase());                // converts to small letters
		System.out.println(abc.toUpperCase());               // converts to capital letters
		System.out.println(abc.equals("Harshitha"));        // true or false by comparing values (case sensitive)
		System.out.println(xyz.equalsIgnoreCase("reddy")); // true or false by comparing values (case insensitive)
		System.out.println(abc.startsWith("ha"));         // to verify that variable starts with specific characters(true or false)
		System.out.println(abc.endsWith("tha"));         // to verify that variable ends with specific character(true or false)
		System.out.println(abc.contains("rshi"));       // to verify specific character is in variable or not(true or false)
		System.out.println(abc.isEmpty());             // to verify variable is empty (true or false)
		System.out.println(abc.concat("gopidi"));     // to add character to variable
		String mno= "harshitha reddy";
		System.out.println(mno.length());
        System.out.println(mno.trim().length());     //trim (to remove space)
		System.out.println(abc.replace("h", "H"));   // to replace one letter
		System.out.println(abc.substring( 0,6));     //substring(to get that character b/w given numbers)
	}

}
