package Assignments;
import java.util.*;
public class CoinApp {

	public static void main(String[] args) {
		int quarter, dime, nickel, penny;
		quarter = 25;
		dime = 10;
		nickel = 5;
		penny = 1;
		Scanner user = new Scanner(System.in);
		
		System.out.println("Please enter some number of cents less than 100");
		int cents = user.nextInt();
		
		int quarters = cents / quarter;
		int dimes = (cents - (quarter * quarters)) / 10;
		int nickels = (cents - (quarter * quarters) - (dimes * dime)) / 5;
		int pennies = (cents - (quarter * quarters) - (dimes * dime) - (nickels * nickel)) / 1;
		
		System.out.println(quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + pennies + " pennies");
	}

}
