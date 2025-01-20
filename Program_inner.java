package Program1;

public class Program_inner {
	static int x = 100;
	 int y = 200;
	
	
	// static inner class
	static class InnerProgram1 {
		static void display1() {
			System.out.println("Inside static class");
			System.out.println(x);
			//System.out.println(y);
		}
		
	}
	
	// Non static inner class - Member inner class
		class InnerProgram2 {
			void display2() {
				System.out.println("Inside non static class");	
				System.out.println(x);
				System.out.println(y);
			}
		}

}
