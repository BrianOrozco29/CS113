package Assignments;

public class CoinFlips {

	
	public static void main(String [] args) { 
	 MonetaryCoin[] coins = new MonetaryCoin[25];
	 int totalValue= 0;
	 int count = 0;
	 double average;
	 
	 for(int i = 0; i<=25; i++){
		 coins[i] = new MonetaryCoin((int) Math.random() * 100);
	 }
	 
	 for (int i = 0; i<=coins.length; i++){
		 if (coins[i].toString() == "Tails"){
			 count++;
			 totalValue+=coins[i].getValue();
		 }		
	 }
	 
	 average = totalValue / count;
	 
	 System.out.println("The average monetary value of the coins with the TAILS face is " + average);
	}
}
