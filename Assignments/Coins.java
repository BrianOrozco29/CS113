package Assignments;
import java.util.Scanner;
public class Coins {

	public static void main(String[] args) {
		
		//Establish variables and Scanner
		int money;
		Double quarters, dimes, nickels, cents;
		Scanner user = new Scanner(System.in);
		
		//Ask user to type an integer
		System.out.println("Enter an integer: ");
		money = user.nextInt();
		
		/*Converts money into each coin's amount. The money variable
		 is multiplied by the amount each coin needs to equal one
		 dollar*/
		quarters = money * 0.25;
		dimes = money * 0.10;
		nickels = money * 0.05;
		cents = money * 0.01;
		
		//Finally the results are printed
		System.out.println(money + " is equal to:");
		System.out.println("$" + quarters + " in quarters,");
		System.out.println("$" + dimes + " in dimes,");
		System.out.println("$" + nickels + " in nickels,");
		System.out.println("and " + " $" + cents + " in pennies.");
	}
}
