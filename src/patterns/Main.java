package patterns;

import patterns.stratgry.Boat;
import patterns.stratgry.Car;
import patterns.stratgry.Driver;

public class Main {

	public static void main(String[] args) {

		Driver driver = new Driver(new Car());
		driver.pilot();

		driver.setVehicle(new Boat());
		driver.pilot();
		driver.honk();

		driver.setVehicle(new Car());
		driver.pilot();

		driver.honk();
	}

}
