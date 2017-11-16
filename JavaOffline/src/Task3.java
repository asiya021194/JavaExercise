
public class Task3 {

	public static void main(String[] args) {
		Task3 evenly = new Task3();
		System.out.println(evenly.evenlySpaced(4, 6, 3));
	}
	
	public boolean evenlySpaced(int a, int b, int c) {
		int[] numList = new int[] { a, b, c };
		
		int smallestNum = Integer.min(Integer.min(a, b), c);
		int largestNum = Integer.max(Integer.max(a, b), c);
		int middleNum = 0;
		
		for (int i = 0; i < numList.length; i++ ) {
			if(numList[i] == smallestNum) {
		
			}else if(numList[i] == largestNum) {
				
			}else {
				middleNum = numList[i];
			}
		}
		
		if (middleNum - smallestNum == largestNum - middleNum) {
			return true;
		}else {
			return false;
		}
	}
}
