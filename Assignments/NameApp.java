package Assignments;
import java.util.Scanner;
import java.util.Random;
public class NameApp {

	public static void main(String[] args) {
		//Establish needed variables
		String first, last, cutFirst, cutLast;
		int randNum;
		Random ran = new Random();
		Scanner user = new Scanner(System.in);
		
		//Ask user for needed inputs
		System.out.println("Welcome to the Password Generator!");
		System.out.println("Please enter your first name: ");
		first = user.nextLine();
		System.out.println("Now enter your last name: ");
		last = user.nextLine();
		
		//Now alter the inputs as need and generate the random number from 10-99
		cutFirst = first.substring(0,1);
		cutLast = last.substring(0,5);
		randNum = ran.nextInt(90) + 10;
		
		//Finally print the results
		System.out.println("Congratulations! You're new password is: ");
		System.out.println(cutFirst + cutLast + randNum);
	}

}
