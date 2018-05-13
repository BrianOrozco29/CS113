package Assignments;

public class PairOfDice {
	private Die die1 = new Die();
	private Die die2 = new Die();
	private int face1 = 1;
	private int face2 = 1;
	private int faceTotal = face1 + face2;
	
	public int roll(){    
		face1 = die1.roll();
		face2 = die2.roll();
		faceTotal = face1 + face2;
	    return faceTotal;
	}
	
	public int pairSum(){
	    return faceTotal;
	}
	   
	public int getDie1(){
	    return face1;
	}
	
	public void setDie1(int value){
	    die1.setFaceValue(value);
	}
	
	public int getDie2(){
		return face2;
	}
	
	public void setDie2(int value){
	    die2.setFaceValue(value);
	}
	
	public void setColor1(String newColor){
	    die1.setColor(newColor);
	}
	
	public void setColor2(String newColor){
	    die2.setColor(newColor);
	}
		   
	public String comboDie(){
		String col = die1.getColor() + "-" + die2.getColor();
		double avr = (double) (die1.getFaceValue() + die2.getFaceValue()) / 2;
		return col + " " + avr;
	}	
	
	public String toString(){
	    String color1 = die1.getColor();
	    String color2 = die2.getColor();
	    return "Die1 color: " + color1 + "\n" + "Die2 color: " + color2;
	}
}
