package Vehicle;

abstract public class Car implements Vehicle {  // partially implementing interface  -- because we can't implement fuel method
	public void start() {
		System.out.println("Start the Car");
	}
	public void stop() {
		System.out.println("Stop the Car");
	}
}
