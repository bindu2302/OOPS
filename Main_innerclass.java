package Program1;

public class Main_innerclass {
	public static void main(String[] args) {
		
		Program_inner.InnerProgram1.display1();
		 
		// Non static - needs creation of object
		Program_inner prg = new Program_inner();
		
		Program_inner.InnerProgram2 innerProgram2 = prg.new InnerProgram2();
		innerProgram2.display2();
		
	}

}
