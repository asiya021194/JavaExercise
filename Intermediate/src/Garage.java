import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public static void main(String[] args) {

		Garage garageList = new Garage();

		Car car = new Car("Micra", 5, 4, "GX63 WCT", 5, true);
		Motorbike motorbike = new Motorbike("Suzuki", 2, 2, "MX54 UPH", 0, true);
		Bus bus = new Bus("MANS", 76, 4, "NX34 HPG", 2, true);

		garageList.vehicleList.add(car);
		garageList.vehicleList.add(motorbike);
		garageList.vehicleList.add(bus);

		for (Vehicle presentVehicle : garageList.vehicleList) {
			System.out.println("Vehicle List before: " + presentVehicle);
		}

		System.out.println();

		garageList.repairVehicles("MANS");

		System.out.println();

		garageList.removeVehicleRegistration("GX63 WCT");

		for (Vehicle presentVehicle2 : garageList.vehicleList) {
			System.out.println("Vehicle List after removing one vehicle: " + presentVehicle2);
		}

		System.out.println();

		garageList.removeVehicleMake("Suzuki");
		for (Vehicle presentVehicle3 : garageList.vehicleList) {
			System.out.println("Vehicle List after removing two vehicles: " + presentVehicle3);
		}
	}

	public void addVehicles(Vehicle newvehicle) {
		vehicleList.add(newvehicle);
	}

	public void repairVehicles(String make) {
		int cost = 0;
		for (Vehicle presentVehicle : vehicleList) {
			if (presentVehicle.getMake().equals(make)) {
				if (presentVehicle instanceof Car == true) {
					cost = presentVehicle.getDoors() * 40;
				} else if (presentVehicle instanceof Motorbike == true) {
					cost = presentVehicle.getDoors() * 0;
				} else if (presentVehicle instanceof Bus == true) {
					cost = presentVehicle.getDoors() * 75;
				}
			}
		}
		System.out.println("Cost of door repairs = £" + cost);
	}

	public void removeVehicleRegistration(String registration) {
		for (Vehicle presentVehicle : vehicleList) {
			if (presentVehicle.getRegistration().equals(registration)) {
				vehicleList.remove(presentVehicle);
				break;
			}
		}
	}

	public void removeVehicleMake(String make) {
		for (Vehicle presentVehicle : vehicleList) {
			if (presentVehicle.getMake().equals(make)) {
				vehicleList.remove(presentVehicle);
				break;
			}
		}
	}
}
