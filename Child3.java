package ChildSpecificMethod.casting;

public class Child3 extends Parent {
	
	@Override
	void display2() {
		System.out.println("Inside child3 display2");
	}
	//Child-specific method
	void displayChild3() {
		System.out.println("Inside child3 display");
	}
}
