package patterns.stratgry;

public class Driver {

	private Vehicle vehicle;

	public Driver(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void pilot() {
		System.out.print("Piolt: ");
		vehicle.Drive();
	}

	public void honk() {
		System.out.print("Honk: ");
		vehicle.Horn();
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
