package accessSpecifier;

public class Constex {
 public Constex() { // constructer 
	 System.out.println("this is a sample");
 }    
 // constructer overloading
 public Constex(int a , int b) {
	 int c = a*b;
	 System.out.println("its a multlipication  "+ c);
 }
 public Constex(String x, String y) {
	 String z= x+y;
	 System.out.println(z);
 }
	public static void main(String[] args) {
		Constex obj = new Constex();
		Constex obj1=new Constex(5,6);
		Constex obj2 = new Constex("Achii","Reddy");
	}

}
