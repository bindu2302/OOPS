package Empdetails;

public class MathStudent extends Student{
	void study() {
		System.out.println("Roll: " + roll + " name: " + name + " is studying maths");
	}
	
	MathStudent() {
		// super();
		roll = 11;
		name  = "Ajay";
	}
	
	MathStudent(int roll){
		// super();
		this.roll = roll;
		name = "Rajiv";
	}
	
	MathStudent(int roll, String name) {
		// super();
		this.roll = roll;
		this.name = name;
	}
}
