package nn.example.corejava.abstrct.mobile;

public class SamsungPhone extends MobileFeatures {

	public void counsellor() {
		System.out.println("Samsung Counsellor TBD");
		
	}

	@Override
	void brand() {
		System.out.println("Samsung Phone");
		
	}
	
	public void showFeatures(){
		brand();
		placeCalls();
		sendMessages();
		sendPictures();
		videoCall();
		playMusic();
		sendFax();
	
	}

}
