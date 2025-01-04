package Vehicle;

public class Main {

	public static void main(String[] args) {
		Vehicle vcl = new PetrolCar();
		vcl.start();
		vcl.fuel();
		vcl.stop();
		
		vcl= new DieselCar();
		vcl.start();
		vcl.fuel();
		vcl.stop();
	}
	
	

}
