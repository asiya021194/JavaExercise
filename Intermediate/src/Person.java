
public class Person {

	private String name;
	private int age;
	private String occupation;

	public Person(String name, int age, String occupation) {
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}

	public static void main(String[] args) {

		PersonInfo personInfo = new PersonInfo();
		Person p1 = new Person("Asiya", 23, "Trainee");
		Person p2 = new Person("Onew", 28, "Singer");
		Person p3 = new Person("Tom", 35, "Teacher");

		personInfo.plist.add(p1);
		personInfo.plist.add(p2);
		personInfo.plist.add(p3);

		for (Person person : personInfo.plist) {
			System.out.println(person.toString());
		}

		System.out.println(personInfo.findName("Asiya"));
	}

	public String toString() {
		return "Name: " + name + " Age: " + name + " Occupation: " + occupation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

}
