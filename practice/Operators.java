package practice;

public class Operators {

	public static void main(String[] args) {
		int a = 15;
		int b = 2;
		// arithematic operators
		// + operator
		System.out.println(a+b);  //17
		System.out.println("sum of the a and b is:"+(a+b));
		// - operator
		System.out.println("difference between a and b is:"+(a-b));
		// * operator
		System.out.println("multiplication of a and b is:"+(a*b));
		// / operator
		System.out.println("quotient of a and b is:"+(a/b));
		// % (mod) operator
		System.out.println("mod(remainder)of a and b is:"+(a%b));
        
	

        //relative operators
        // == operators
          System.out.println(a==b);
        // < operators
         System.out.println(a<b);
        // > operators
         System.out.println(a>b);
        // <=  operators
         System.out.println(a<=b);
        // >=  operators
         System.out.println(a>=b);
        // !=  operators
         System.out.println(a!=b);
         
         
         //logical operators
         boolean c= true;
         boolean d= false;
         // &&(AND) operators
         System.out.println(c&&d);  // it will be true only both are are two
         //  || (OR) operators
         System.out.println(c||d);  // it will be true if any one is true
         // ! (NOT) operators
         System.out.println(!d);    // it will print the opposite of the value 
         
         
         // incremental and decremental operators
         int n= 5;
         System.out.println(n);
         // incremental operator  two ways
         n++;
         System.out.println(n);
         n=n+1;
         System.out.println(n);
         // decremental operator two ways
         n--;
         System.out.println(n);
         n=n-1;
         System.out.println(n);
         
         
         
         //assignment operators
         int n1= 100;
         int n2=50;
         // = operator
         n1= n2;
         System.out.println("output is:"+n1);
         // += operator
		 n1 += n2;
		 System.out.println("Output of n1 : "+ n1);
		 // -= operator
		 n1 -= n2;
		 System.out.println("Output of n1: "+ n1);
		 // *= operator
		 n1 *= n2;
		 System.out.println("Output of n1: "+ n1);
		 // /= operator 
		 n1 /= n2;
		 System.out.println("Output of n1: "+ n1);
		// %= operator
			n1 %= n2;
			System.out.println("Output of n1: "+ n1);
		 
		 // ternary operators 
		 int val = (n1>n2)?n1:n2;
		 System.out.println(val);
		 int val1 = (n1<n2)?n1:n2;
		 System.out.println(val1);
		 
         
	}
}