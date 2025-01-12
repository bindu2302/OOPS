package Empdetails;

public class MainEmployee {
	public static void main(String[] args) {
		
		// reference_type ref_var = new className(constructor call)
		
		Employee e1 = new Employee(101,"akash", 35000.60,"akash@gmail.com", 7013002800L,"civil","bangalore","male");
		e1.empDetails();
		
		System.out.println("---------------------");
		
		Employee e2 = new Employee(102,"ayush",20000.56,"ayush@gmail.com",9885525891L,"cse","hyderabad","male");
		e2.empDetails();
		
		System.out.println("---------------------");

		
		Employee e3 = new Employee(103,"priya",60000.80,"priya@gmail.com",9160199009L,"ece","chennai", "female");
		e3.empDetails();
	}

}
