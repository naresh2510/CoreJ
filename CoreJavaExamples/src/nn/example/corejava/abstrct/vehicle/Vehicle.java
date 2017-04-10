package nn.example.corejava.abstrct.vehicle;

public abstract class Vehicle {
	
	Vehicle() {System.out.println("New vehicle created");}
	
	public void changeGear() {
		System.out.println("Gear changed !");
	}
	abstract void drive();
}
