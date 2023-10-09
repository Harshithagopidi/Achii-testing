package practice;

public class Primenumbers {

	public static void main(String[] args) {
	int numb = 50;
	for(int i =2; i<=numb;i++) {
		
		boolean value = true;
		for(int j=2;j<=i/2;j++) {
			if(i%j == 0) {
				value= false;
				break;
			}
		}
		if(value) {
			System.out.println(i);
		}
	}

	}

}
