
public class Exercise1 {

	public static void main(String[] args) {
		System.out.println(Blackjack(20, 18));
	}

	public static int Blackjack(int a, int b) {
		if (a > 21 && a == b) {
			return 0;
		} else if (b > 21 && a == b) {
			return 0;
		} else if (b <= 21 && a < b) {
			return b;
		} else if (a <= 21 && a > b) {
			return a;
		} else if (a >= 21 && a < b) {
			return a;
		} else {
			return b;
		}
	}

}
