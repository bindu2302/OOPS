import java.util.Scanner;

public class Circle extends Shape {
	
	double radius;
	@Override
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		radius = scan.nextDouble();
	}
	
	@Override
	public void calculateArea() {
		area= Math.PI * radius * radius;
		
	}

}
