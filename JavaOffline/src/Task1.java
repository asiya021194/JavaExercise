
public class Task1 {
	
	
	public static void main(String[] args) {
		Task1 task1 = new Task1();
		
		System.out.println(task1.doubleChar("Hello"));
	}
	
	public String doubleChar(String input) {
	String tmp = "";
	for (int i = 0; i < input.length(); i++ ) {
		tmp += input.charAt(i);
		tmp += input.charAt(i);
	}
	return tmp;
	}

}
