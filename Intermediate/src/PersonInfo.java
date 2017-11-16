import java.util.ArrayList;

public class PersonInfo {

	protected ArrayList<Person> plist = new ArrayList<Person>();

	public Person findName(String foundName) {
		for (Person person : plist) {
			if (foundName == person.getName()) {
				return person;
			}
		}
		return null;
	}
}

//Parameter
//doggoesbark -> bark
//public String findLastWord(String input) {
//	int goesIndex = input.indexOf("goes") +4;
//	String subStr = input.substring(goesIndex, input.length());
//	return subStr;
//}