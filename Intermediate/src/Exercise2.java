
public class Exercise2 {

	public static void main(String[] args) {
		System.out.println(UniqueSum(1, 2, 3));
	}

	public static int UniqueSum(int a, int b, int c) {
		if (a == b && b != c) {
			return c;
		} else if (b == c && a != c) {
			return a;
		} else if (a == c && b != c) {
			return b;
		} else if (b == c && a == c) {
			return 0;
		} else {
			return a + b + c;
		}
	}
}
