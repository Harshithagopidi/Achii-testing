package practice;

class A{
	public void pen() {
		System.out.println("pen is in red colour");
	}
	public void pencil() {
		System.out.println("pencil is in black colour");
	}
}
class B extends A{
	public void eraser() {
		System.out.println(" eraser is in white colour");
	}
	@Override
	public void pen() {
		System.out.println("pen is in blue colour");
	}
}
public  class methodoverriding extends B {
	public  static void main(String[] args) {
		methodoverriding mn = new methodoverriding();
		mn.pen();
		mn.eraser();
		}
	}

