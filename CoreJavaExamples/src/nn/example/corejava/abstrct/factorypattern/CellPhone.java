package nn.example.corejava.abstrct.factorypattern;

public class CellPhone {

	public static void main(String[] args) {
		
		String company="Apple";
		
		CellPhoneFactory factory = new CellPhoneFactory();
		MobileFeatures phone = factory.getCellphone(company);
		
		phone.showFeatures();
		
	}

}
