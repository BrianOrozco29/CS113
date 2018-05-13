package Assignments;

import java.util.Scanner;

import labs.Executive;
import Assignments.BonusTooHighException;
public class ExecutiveMain2 {
	public static void main(String[] args) throws BonusTooHighException{
		Scanner user = new Scanner(System.in);
		BonusTooHighException error = new BonusTooHighException("Value is too high!");
		
		System.out.println("How many executive arrays?");
		int execLength = user.nextInt();
		Executive[] exec = new Executive[execLength];
		
		int validCount = 0;
		double payment = 0;
		
		for(int i = 0; i < exec.length; i++){
			try{
				System.out.println("Please enter the information of executive number " + (i+1));
				System.out.println("Name:");
				String name = user.nextLine();
				
				System.out.println("Address:");
				String address = user.nextLine();
				
				System.out.println("Phone number:");
				String phone = user.nextLine();
				
				System.out.println("Social Security Number:");
				String ssn = user.nextLine();
				
				System.out.println("Rate:");
				double rate = user.nextDouble();
				
				exec[i] = new Executive(name, address, phone, ssn, rate);
				
				System.out.println("Bonus:");
				int bonus = user.nextInt();
				if(bonus > 10000){
					throw error;
				}
				else{
					exec[i].awardBonus(bonus);
					validCount++;
				}
			}
			catch(BonusTooHighException error2){
				System.out.println("The bonus is too high");
				exec[i].awardBonus(0);
			}
		}
		
		System.out.println("The number of valid bonuses is " + validCount);
	    
		for(int i = 0; i<exec.length; i++){
			payment += exec[i].pay();
		}
		
		System.out.println("The average payment is " + (payment/exec.length));
	}
}
