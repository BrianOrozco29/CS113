package Assignments;

public class TestPairOfDice {

	public static void main(String[] args) {
		PairOfDice dice = new PairOfDice();
		int count = 0;
		for (int i = 0; i < 1000; i++){
			dice.roll();
			if((dice.getDie1() == 6)  && (dice.getDie2()== 6)){
				count++;
			}	
		}
		System.out.println("A box car was rolled " + count + " times!");
	}

}
