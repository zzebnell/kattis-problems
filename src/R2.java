import java.util.Scanner;

public class R2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int s1 = sc.nextInt();
		int s = sc.nextInt();
		
		// (s1 + s2) / 2 = s
		// s1 + s2 = 2s
		// s2 = 2s - s1
		
		System.out.println( 2 * s - s1 );
		
	}
	
}