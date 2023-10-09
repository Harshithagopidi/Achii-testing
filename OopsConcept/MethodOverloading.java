package OopsConcept;

public class MethodOverloading {
	public void sample01() {
		System.out.println("this is a sample01 method");
	}
	public void sample01(int a, int b) {
		System.out.println("the addition of sample02  :"+(a+b));
	}
	public void sample01(String x,String y) {
		System.out.println("the concotination of "+ x+ y);
	}
	public void sample01(int m,String n) {
		System.out.println(m+n);
	}

	public static void main(String[] args) {
		MethodOverloading abc= new MethodOverloading();
		abc.sample01();
		abc.sample01(10,5);
		abc.sample01("Achii", "Reddy");
		abc.sample01(18, "harshitha");
	}

}
