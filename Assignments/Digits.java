package Assignments;
import java.util.*;
public class Digits {
	
	public static void printDigits(int num){
		if (num < 10){
			System.out.println(num);
		}
		else{
			System.out.println(num % 10);
			printDigits(num/10);
		}
	}
	
	public static void main(String[] args){
		Scanner user = new Scanner(System.in);
		
		System.out.println("Please enter an integer that you would like to print in reverse:");
		int digits = user.nextInt();
		
		printDigits(digits);
	}
}
