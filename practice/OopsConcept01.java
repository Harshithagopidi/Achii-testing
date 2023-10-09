package practice;

public class OopsConcept01 { // class with multiple methods
	// class variable(2 types)
	static String achii; // static variable
	int t; // non static variable
	
	//static methods(can directly call in main method)
	public static void first() {  
		int a=10; // local variable
		int b=20;
		System.out.println(b-a);	
	}
	public static void second() {
		int x=0;
		int y=9;
		System.out.println(x+y);
	}
	//non static methods(needs obj to run in main method)
	public void third() {
		int m=2;
		int n=8;
		System.out.println(m*n);
	}

	public static void main(String[] args) {
		first();
		second();
		// instance variable
		OopsConcept01 abc=new OopsConcept01();
		abc.third();
	}

}
