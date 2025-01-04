// Downcasting- converting parent type reference to child level temporarily
package ChildSpecificMethod.casting;

public class Main {

	public static void main(String[] args) {
		Parent ref; //Creating parent type reference
		
		Child1 ch1 = new Child1(); // Creating child1 object
		ref = ch1; // Upcasting, ref is referrring to child object
		ref.display1(); // calling inherited method of child1 using parent ref
		ref.display2(); //calling overridden method of child1 using parent ref
		ch1.displayChild1(); //calling child-specific method of child1 using using child ref
		
		((Child1)(ref)).displayChild1(); // Downcasting- to call child specific method using parent ref
		
		System.out.println("----------------------");
		
		Child2 ch2 = new Child2(); // Creating child2 object
		ref = ch2; // Upcasting, ref is referrring to child object
		ref.display1(); // calling inherited method of child2 using parent ref
		ref.display2(); //calling overridden method of child2 using parent ref
		ch2.displayChild2(); //calling child-specific method of child2 using using child ref
		
		((Child2)(ref)).displayChild2(); // Downcasting- to call child specific method using parent ref
		
		System.out.println("----------------------");

		Child3 ch3 = new Child3(); // Creating child3 object
		ref = ch3; // Upcasting, ref is referrring to child object
		ref.display1(); // calling inherited method of child3 using parent ref
		ref.display2(); //calling overridden method of child3 using parent ref
		ch3.displayChild3(); //calling child-specific method of child3 using using child ref
		
		((Child3)(ref)).displayChild3(); // Downcasting- to call child specific method using parent ref
		
	}
	
// Downcasting approach using instanceof operator	
// downcasting- converting paretn type reference to child level temporarirly
	
//	accessMethods(new Child1());
//	System.out.println("----------------------");
//	accessMethods(new Child2());
//	System.out.println("----------------------");
//	accessMethods(new Child3());
//}

	
	
//	static void accessMethods(Parent ref) { // ref=Child1 object // ref = Child2 object // ref = Child3 object
//		ref.display1();//calling inherited method
//		ref.display2();//calling overridden method
//		
//		if(ref instanceof Child1) { // Checking whether ref is refernce variable of child1 type
//			((Child1)(ref)).displayChild1();
//		} else if (ref instanceof Child2) {
//			((Child2)(ref)).displayChild2();
//		} else {
//			((Child3)(ref)).displayChild3();
//		}
//	}

}
