package nn.example.corejava.abstrct.mobile;

public class CellPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileFeatures iphone = new ApplePhone();
		//iphone.brand();
		//iphone.counsellor();
		((ApplePhone) iphone).showFeatures();
		
	}

}
