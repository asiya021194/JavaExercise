
public class Task2 {
	
	public static void main(String[] args) {
		
		System.out.println(getSandwich("breadjambread"));
	}
	
	public static String getSandwich(String input) {
		int firstBreadIndex = input.indexOf("bread") + 5;
		int lastBreadIndex = input.lastIndexOf("bread");
		String inbetweenBread = input.substring(firstBreadIndex, lastBreadIndex);
		return inbetweenBread;
	}
	
}
