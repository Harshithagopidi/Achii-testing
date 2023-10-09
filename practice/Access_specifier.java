package practice;

public class Access_specifier {
	public static void name() {
		System.out.println("print public");
		
	}
private static void name1() {
	System.out.println("private");
}
protected static void name3() {
	System.out.println("protected");
}
static void name4() {
	System.out.println("default");
}
public static void main(String[]args) {
	//Access_specifier obj = new Access_specifier();
	//obj name();
	Access_specifier.name();
	Access_specifier.name1();
	Access_specifier.name3();
    Access_specifier.name4();
}
}
