
public class Exercise6 {

	public static void main(String[] args) {
		System.out.println(Addition(0, 3, true));
		System.out.println(Addition(0, 3, false));
	}

	public static int Addition(int a, int b, boolean isAddorMultiply) {
		if (isAddorMultiply) {
			return a + b;
		} else {
			return a * b;
		}
	}
}
