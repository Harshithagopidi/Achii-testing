package OopsConcept;

public class MethodOR02 extends MethodOverriding01 {

	public static void main(String[] args) {
		MethodOR02 op=new MethodOR02();
		op.setup();
		op.teradown();
	}
	@Override
    public void setup() {
    	System.out.println("to intialize the browser in child class");
    }
   
}
