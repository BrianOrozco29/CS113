package Assignments;
import java.util.*;
public class RandomChars {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String randString = user.nextLine();
		
		char rand1 = randString.charAt( (int) Math.random() * randString.length() );
		char rand2 = randString.charAt( (int) Math.random() * randString.length() );
		
		System.out.println(rand1 + "" + rand2);
	}

}
