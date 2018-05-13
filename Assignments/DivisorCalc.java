package Assignments;

import java.util.Scanner;

public class DivisorCalc {
	
	public static int gcd(int num1, int num2){
		if(num2 <= num1 && num1 % num2 == 0){
			return num2;
		}
		else if(num1 < num2){
			return gcd(num2, num1);
		}
		else{
			return gcd(num2, num1%num2);
		}
	}
	
	public static void main(String[] args){
		Scanner user = new Scanner(System.in);
		System.out.println("What two numbers would you like to check for Greatest Common Divisor? (Press Enter after each input)");
		
		int num1 = user.nextInt();
		int num2 = user.nextInt();
		
		System.out.println("The Greatest Common Divisor is: " + gcd(num1, num2));
	}
}
