package Anonymous;

public class MainAnonymous {

	public static void main(String[] args) {
		//ProgramInterface prg = new ProgramInterface();
		// prg.display1();
		
		ProgramInterface prg2 = new ProgramInterface()
		// Anonymous class body which is automatically implementing ProgramInterface
		{
			@Override public void display1() {
				System.out.println("Inside anonymous class display1");
			}
			
			@Override public void display2() {
				System.out.println("Inside anonymous class display2");
			}
		};
		
		prg2.display1();
		prg2.display2();
				
	}

}
