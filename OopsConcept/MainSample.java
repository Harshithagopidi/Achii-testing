package OopsConcept;

public class MainSample implements Sample01,Sample02 {
public static void main(String[] args) {
	
	MainSample ms= new MainSample();
	ms.a1();
	ms.a2();
	ms.a3();
    }
	@Override
	public void a1() {
		System.out.println("a1 is a sample1 interface");
	
	}

	@Override
	public void a2() {
	System.out.println("a2 is a sample2 interface");
		
	}
	@Override
	public void a3() {
		System.out.println("a3");
		
	}

}
