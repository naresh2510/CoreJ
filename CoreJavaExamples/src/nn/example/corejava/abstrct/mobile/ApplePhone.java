package nn.example.corejava.abstrct.mobile;

public class ApplePhone extends MobileFeatures  {

	
	public void counsellor() {
		System.out.println("Iphone counsellor");
		
	}
	
	public void canDance(){
		System.out.println("Iphone can dance");
	}

	@Override
	void brand() {
		System.out.println("Apple Phone");
	}
	
	public void showFeatures(){
		super.showFeatures();
		counsellor();
		canDance();
	}
}
