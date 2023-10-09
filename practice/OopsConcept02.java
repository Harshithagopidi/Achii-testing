package practice;

public class OopsConcept02 {
	 public Object add(int a, int b) {
		 System.out.println(a+b);
		 Object abc = null;
		return abc;
	 }
	 public static void multi(int m,int n) {
		 System.out.println(m*n);
	}
	public static void main(String[] args) {
		OopsConcept02 abc = new OopsConcept02();
		abc.add(5, 6);
		multi(2, 3);
	}

}
