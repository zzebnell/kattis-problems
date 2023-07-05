import java.util.Scanner;

public class quadrant {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Punto punto = new Punto(sc.nextInt(), sc.nextInt());
		System.out.println(punto.quadrant());

	}

}

class Punto {
	private int x;
	private int y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int quadrant() {
		int q = -1;
		
		if (x > 0 && y > 0)
			return 1;
		else if (x < 0 && y > 0)
			return 2;
		else if (x < 0 && y < 0)
			return 3;
		else if (x > 0 && y < 0)
			return 4;
		
		return q;
	}
}