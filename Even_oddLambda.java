interface NumberCheck {
	String check(int number);
}

public class Even_oddLambda {

	public static void main(String[] args) {
		NumberCheck isEvenOdd = (number) -> number%2==0 ? "Even": "Odd";
		
		System.out.println("The number 10 is: " + isEvenOdd.check(10));
		System.out.println("The number 15 is: " + isEvenOdd.check(15));

	}

}
