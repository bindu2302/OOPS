abstract public class Shape {
	
	double area;

	abstract void acceptInput();
	
	abstract void calculateArea();
	
	void displayArea() {
		System.out.println(area);
	}
}
