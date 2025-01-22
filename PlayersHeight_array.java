// Write a java program to store height (double) of players
// Take the user input for no of players and height of each player

import java.util.Scanner;

public class PlayersHeight_array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the no.of players: ");
		int n = scan.nextInt();
		double[] height = new double[n];
		
		for(int i=0; i<=height.length-1; i++) {
			System.out.println("Enter the height of player: " + (i+1));
			height[i] = scan.nextDouble();
		}
		
		for(int i=0; i<=height.length-1; i++) {
			System.out.println("The height of player " + (i+1) + " is: " + height[i]);
		}
		
	}

}
