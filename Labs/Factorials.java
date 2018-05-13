package labs;
import java.util.Scanner;
public class Factorials {

	public static void main(String[] args) {
		System.out.println("Enter a non-negative integer:");
		Scanner scan = new Scanner(System.in);
		int base = scan.nextInt();
		
		while(true)
		{
			if(base < 0)
			{
				System.out.println("Error, please enter a valid input!");
				base = scan.nextInt();
				continue;
			}
			
			else if (base == 0)
			{
				System.out.println("0! is equal to 1");
				break;
			}
				
			else
			{
				long factorial = 1;
				int n = 1;
				while(base >= n)
				{					
					factorial = factorial * n;
					n++;
				}	
				System.out.println(base + "! is equal to " + factorial);
				break;
			}		
		}
		
	}
}

