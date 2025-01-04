import java.util.Scanner;
public class Square extends Shape {
	
	double side;
	@Override
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the side of a square");
		side = scan.nextDouble();
	}
	
	public void calculateArea() {
		area = side * side;	
	}
}
