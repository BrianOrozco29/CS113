package Assignments;
import java.util.Scanner;
public class ReadInts {

	public static void main(String[] args) {
		int[] result = new int[51];
		Scanner user = new Scanner (System.in);
		
		System.out.print("Enter integers, then type END to end");
		while (user.hasNextInt()){
		int n =user.nextInt();
		if (n>=0 && n<=50)
			result[n]++;
		}
		System.out.println("\nHere are the counts of the integers"
		+ " entered: ");
		for (int i=0; i<=50; i++)
		if (result[i]>0)
		System.out.println(i + " " + result[i]);
	}

}
