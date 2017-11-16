
public class Car extends Vehicle {

	private boolean isthereaboot;

	public Car(String make, int passenger, int wheels, String registration, int doors, boolean isthereaboot) {
		super(make, passenger, wheels, registration, doors);
		this.isthereaboot = isthereaboot;
	}

	public boolean isIsthereaboot() {
		return isthereaboot;
	}

	public void setIsthereaboot(boolean isthereaboot) {
		this.isthereaboot = isthereaboot;
	}

	public String toString() {
		return super.toString() + "," + " Boot?: " + isthereaboot;
	}
	
	
	
}
