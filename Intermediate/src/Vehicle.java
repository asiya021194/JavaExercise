
public abstract class Vehicle {

	private String make;
	private int passenger;
	private int wheels;
	private String registration;
	private int doors;

	public Vehicle(String make, int passenger, int wheels, String registration, int doors) {
		this.make = make;
		this.passenger = passenger;
		this.wheels = wheels;
		this.registration = registration;
		this.doors = doors;
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getPassenger() {
		return passenger;
	}

	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public String toString() {
		return "Vehicle make: " + make + "," + " No. of passengers: " + passenger + "," + " No. of wheels: " + wheels + "," + " Registration No.: " + registration + "," + " No. of doors: " + doors;
	}
	
}
