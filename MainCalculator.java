package Anonymous;

public class MainCalculator {

	public static void main(String[] args) {
		Calculator calci = new Calculator() {
			@Override
			public void add() {
				System.out.println(10+2);
			}
			
			@Override
			public void subtract() {
				System.out.println(10-2);
			}
		};
		calci.add();
		calci.subtract();
		calci.multiply();
		
	}

}
