package Empdetails;

public class Employee {
	int id;
	String name;
	double salary;
	String emailId;
	long phone;
	String address;
	String department;
	String gender;
	
	// constructor - special method- name(parameters) { body}
	
	Employee(int a, String b, double c,String d, long e,String f,String g, String h) {
		id =a;
		name =b;
		salary = c;
		emailId=d;
		phone=e;
		address=f;
		department=g;
		gender=h;
	}
	void empDetails() {
		System.out.println("ID: "+ id);
		System.out.println("Name: "+ name);
		System.out.println("EmailId: "+ emailId);
		System.out.println("Phone: "+ phone);
		System.out.println("Address: "+ address);
		System.out.println("Department: "+ department);
		System.out.println("Gender: "+ gender);

	}

}
