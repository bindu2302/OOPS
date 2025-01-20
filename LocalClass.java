package Program1;

public class LocalClass { //outer class
	void method1() { // method of outer class
		class LocalInnerProgram1 { // local inner class
			void inner() {
				System.out.println("Inside inner method");
			}
		}
		
		LocalInnerProgram1 lip1 = new LocalInnerProgram1();
		lip1.inner();
	}

}
