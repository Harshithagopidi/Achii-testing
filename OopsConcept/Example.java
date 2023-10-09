package OopsConcept;
interface Animal {
	  public void animalSound(); 
	  public void sleep(); 
	}

	class Pig implements Animal {
	  public void animalSound() {
	    // The body of animalSound() is provided here
	    System.out.println("The pig says: wee wee");
	  }
	  public void sleep() {
	    // The body of sleep() is provided here
	    System.out.println("Zzz");
	  }
	}

	class Example {
	  public static void main(String[] args) {
	    Pig myPig = new Pig();  // Create a Pig object
	    myPig.animalSound();
	    myPig.sleep();
	  }
	}
