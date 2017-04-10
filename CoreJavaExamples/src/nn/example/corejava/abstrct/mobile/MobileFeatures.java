package nn.example.corejava.abstrct.mobile;

public abstract class MobileFeatures implements MobileSpecs {

	
	public void placeCalls() {
		System.out.println("can place calls");
		
	}

	
	public void sendMessages() {
		System.out.println("can send messages");
		
	}

	
	public void sendPictures() {
		System.out.println("can send Pictures");
		
	}

	
	public void videoCall() {
		System.out.println("can place video Calls");
		
	}

	
	public void playMusic() {
		System.out.println("can play music");
		
	}

	
	public void sendFax() {
		System.out.println("can send fax");
		
	}

	abstract void brand();
	
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
