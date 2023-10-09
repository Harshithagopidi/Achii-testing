package practice;

public class Javabasics {
	static int a= 15;   // static variable
	public static void main(String[]args) {
		System.out.println("iam harshitha");
		System.out.println(a);
		
	     One obj = new One();//instance variable
	     obj.Telangana();
	     System.out.println(obj.b);
	     System.out.println(obj.c);
	     
	     
	     Two obj1 = new Two();//instance variable
	     System.out.println(obj1.b1);
	     System.out.println(obj1.c1);
	     obj1.banglore();
	     
	     Three obj2 = new Three();//instance variable
	     System.out.println(obj2.b2);
	     System.out.println(obj2.c2);
	     obj2.chennai();
	     
	     
	     Four obj3= new Four();//instance variable
	     System.out.println(obj3.b3);
	     System.out.println(obj3.c3);
	     obj3.India();
		
	}
}

class One{
	static int b=20;// static variable(int)
	int c = 100; // non static variable(int)
	public void Telangana() {
		int place =5000; // local variable with datatype as int
		System.out.println("iam from telangana");
		System.out.println(place);
	}
}
class Two{
	static double b1 = 17.77;// static variable(double)
	double c1= 10.7;// non static variable(double)
	public static void banglore() {
		double Name = 20.66;// local variable with datatype as double
		System.out.println("iam in banglore");
		System.out.println(Name);
		
	}
}
 class Three{
	 static char b2 ='1';// static variable(char)
	 int c2 ='2';// non static variable(int)
	 public static void chennai() {
		 int state = 3000;// local variable with datatype as int
		 System.out.println("its chennai");
		 System.out.println(state);
		 
	 }
 }
 class Four{
	 static String b3 = "Harshitha";// static variable(string)
	 String c3 ="gopidi";// non static variable(string)
	 public static void India() {
		 String country = "India";// local variable with datatype as string
		 System.out.println("iam Indian");
		 System.out.println(country);

}
 }