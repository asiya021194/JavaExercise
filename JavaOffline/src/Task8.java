
public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int bunnyEars(int numOfBunnies) {
		if(numOfBunnies == 0) {
			return 0;
		}else return 2 + bunnyEars(numOfBunnies - 1);
	}
	
}
