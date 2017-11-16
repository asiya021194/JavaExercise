
public class Bus extends Vehicle {

	private boolean isdoubledecker;

	public Bus(String make, int passenger, int wheels, String registration, int doors, boolean isdoubledecker) {
		super(make, passenger, wheels, registration, doors);
		this.isdoubledecker = isdoubledecker;
	}

	public boolean isIsdoubledecker() {
		return isdoubledecker;
	}

	public void setIsdoubledecker(boolean isdoubledecker) {
		this.isdoubledecker = isdoubledecker;
	}

	public String toString() {
		return super.toString() + "," + " Double Decker?: " + isdoubledecker;
	}
	
	
}
