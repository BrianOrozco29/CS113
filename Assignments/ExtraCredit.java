package Assignments;
import java.util.Scanner;
public class ExtraCredit {

	public static void main(String[] args) {
		//Set up Variables and Scanner
		Scanner user = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = user.nextLine();
		
		//Generate random number equal to the length of the name - 1
		int ranNum =(int) (Math.random() * name.length());
		
		//Use this random value to take a character from the name
		char newChar = name.charAt(ranNum);
		
		//Print Results
		System.out.println("Here is a random character from your name: ");
		System.out.println(newChar);
	}

}
