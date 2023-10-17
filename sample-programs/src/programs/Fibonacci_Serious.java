package programs;

public class Fibonacci_Serious {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter number");
		n = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.print(a);
		System.out.print(b);
		for (int i = 2; i <= 5; i++) {
			int c = a + b;
			System.out.print(c + "");
			a = b;
			b = c;
		}
	}

}
