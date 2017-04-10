package nn.example.corejava.abstrct.example1;

public class AbstractExample1Test extends AbstractExample1{

	@Override
	void display() {
		System.out.println("Abstract method implemented");		
	}
	
	public static void main(String args[]){
		AbstractExample1 absex1 = new AbstractExample1Test();
		
		absex1.display();
		
	}
	
}