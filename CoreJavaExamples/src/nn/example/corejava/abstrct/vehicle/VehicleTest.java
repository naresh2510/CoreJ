package nn.example.corejava.abstrct.vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		
		Vehicle v;
		
		v= new Bike();
		v.drive();
		v.changeGear();

		v= new Truck();
		v.drive();
		v.changeGear();
	}

}
