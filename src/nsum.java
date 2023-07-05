import java.util.Scanner;

public class nsum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;
		
		while (N-- != 0) {
			sum += sc.nextInt();
		}
		
		System.out.println(sum);
		
	}
	
}