import java.util.Scanner;
public class Rectangle extends Shape {
	
	double length, breadth;
	@Override
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		length = scan.nextDouble();
		System.out.println("Enter the breadth of rectangle");
		breadth = scan.nextDouble();

	}
	
	@Override
	void calculateArea() {
		area = length * breadth;
	}

}
