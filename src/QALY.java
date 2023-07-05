import java.util.Scanner;

public class QALY {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double sum = 0;

		for (int i = 0; i < N; i++) {
			double index = sc.nextDouble();
			double time = sc.nextDouble();

			sum += index * time;
		}

		System.out.println(sum);

	}

}