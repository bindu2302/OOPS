package ChildSpecificMethod.casting;

public class Child2 extends Parent {
	
	@Override
	void display2() {
		System.out.println("Inside child2 display2");
	}
	//Child-specific method
	void displayChild2() {
		System.out.println("Inside child2 display");
	}
	

}
