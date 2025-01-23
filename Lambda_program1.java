// Functional interface

interface AddTwoNumbers {
   public int add(int a, int b);
}

public class Lambda_program1 {
    public static void main(String[] args) {
        AddTwoNumbers addition = (a, b) -> a + b;

        int result = addition.add(10, 20);
        System.out.println("The sum is: " + result);
    }
}
