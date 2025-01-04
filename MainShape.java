
public class MainShape {

	public static void main(String[] args) {
		
		shapeMethods(new Rectangle());
		shapeMethods(new Circle());
		shapeMethods(new Square());
	}
	
	static void shapeMethods(Shape sh) {
		sh.acceptInput();
		sh.calculateArea();
		sh.displayArea();
	}

}
