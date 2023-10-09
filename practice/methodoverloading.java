package practice;

public class methodoverloading{

	public  void saanvi(int age) {
		System.out.println(age);
	}
	public void saanvi(String name) {
		System.out.println(name);
	}
    public void saanvi(String name,int age) {
    	System.out.println("name:"+ name);
    	System.out.println("age:"+age);
    }
    public static void main(String[]args) {
    	methodoverloading abc= new methodoverloading();
    	abc.saanvi("achii", 25);
    }
}
