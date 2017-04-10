package nn.example.corejava.abstrct.factorypattern;

public class CellPhoneFactory {
	
	MobileFeatures cellphone;
	
	
	
	public MobileFeatures getCellphone( String company) {
		if(! company.isEmpty() && company.equalsIgnoreCase("Apple")){
			cellphone = new ApplePhone();
			
		}
		else if(! company.isEmpty() && company.equalsIgnoreCase("Samsung")){
			cellphone = new SamsungPhone();
	
		}
			return cellphone;
	}

	
	
}
