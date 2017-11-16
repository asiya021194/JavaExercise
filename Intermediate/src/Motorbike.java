
public class Motorbike extends Vehicle {

	private boolean ischanginggearbyfoot;

	public Motorbike(String make, int passenger, int wheels, String registration, int doors,
			boolean ischanginggearbyfoot) {
		super(make, passenger, wheels, registration, doors);
		this.ischanginggearbyfoot = ischanginggearbyfoot;
	}

	public boolean isIschanginggearbyfoot() {
		return ischanginggearbyfoot;
	}

	public void setIschanginggearbyfoot(boolean ischanginggearbyfoot) {
		this.ischanginggearbyfoot = ischanginggearbyfoot;
	}

	public String toString() {
		return super.toString() + "," + " Changing gear by foot?: " + ischanginggearbyfoot;
	}
	

}
