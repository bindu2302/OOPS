package Empdetails;

//public class MainStudent extends Object {  -- by default 

public class MainStudent {


	public static void main(String[] args) {
		MathStudent ms1 = new MathStudent();
		ms1.study();
		
		MathStudent ms2 = new MathStudent(12);
		ms2.study();
		
		MathStudent ms3 = new MathStudent(13,"Rachan");
		ms3.study();
	}

}
