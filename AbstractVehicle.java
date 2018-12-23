/* Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 5
 */
public class AbstractVehicle {
public static void main(String[] args) {
	Bicycle myBike = new Bicycle();
	MotorVehicle myMV = new MotorVehicle (5.5, 4);
	System.out.println("The bicycle has "+myBike.numWheels+" wheels");
	System.out.println("The horsepower of the motor vehicle is "+myMV.computeHP());
	}
}
abstract class Vehicle {
	String ownersName;
	int numWheels;
}
class Bicycle extends Vehicle{
	public Bicycle() {
	numWheels = 2;
	}
}
class MotorVehicle extends Vehicle{
	double evd;
	public MotorVehicle(double evd, int numWheels) {
		this.evd = evd;
		this.numWheels = numWheels;
	}
	public double computeHP() {
		return (evd * numWheels);
	}
}
