package labs;
import java.util.*;

public class AChargeAccountStatement {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		double prevBalance = scan.nextDouble();
		double totalCharge = scan.nextDouble();
		double totalBalance = prevBalance + totalCharge;
		double interest;
		
		
		if(prevBalance == 0)
			interest = 0;
		else
			interest = totalBalance * 0.02;
		
		double newBalance = totalBalance + interest;
		
		if (newBalance < 50)
			System.out.println("The minimum payment is $" + newBalance);
		else if(newBalance >= 50 && newBalance <= 300)
			System.out.println("The minimum payment is $50.00");
		else
			System.out.println("The minimum payment is $" + (newBalance * 0.2));
	}
}
