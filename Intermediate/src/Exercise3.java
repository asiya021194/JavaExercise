
public class Exercise3 {

	public static void main(String[] args) {
		System.out.println(tooHot(106, true));
	}

	public static boolean tooHot(int t, boolean isSummer) {
		if (isSummer) {
			if (t >= 60 && t <= 100) {
				return true;
			} else {
				return false;
			}
		} else {
			if (t >= 60 && t <= 90) {
				return true;
			} else {
				return false;
			}
		}
	}

}
