
public class Exercise8 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Addition(i, 3, true));
			System.out.println(Addition(i, 3, false));
		}
	}

	public static int Addition(int a, int b, boolean isAddorMultiply) {
		if (a == 0) {
			return b;
		} else if (b == 0) {
			return a;
		} else if (isAddorMultiply) {
			return a + b;
		} else {
			return a * b;
		}
	}

}
