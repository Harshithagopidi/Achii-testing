package practice;

public class LoopEx {

	public static void main(String[] args) {
		int n = 5;      // 5 bcz 5 times it should print
		for( int i=1;i<=n;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("   *");
			}
			System.out.println();
		}
	}
}
