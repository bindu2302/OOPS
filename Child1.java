package ChildSpecificMethod.casting;

public class Child1 extends Parent {
	
	@Override
	void display2() {
		System.out.println("Inside child1 display2");
	}
	//Child-specific method
	void displayChild1() {
		System.out.println("Inside child1 display");
	}
	

}
