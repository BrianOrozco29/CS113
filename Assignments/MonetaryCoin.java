package Assignments;

public class MonetaryCoin extends Coin{
	private int coinValue;
	
	public MonetaryCoin(int value){
	    coinValue = value;
	}

	public int getValue(){
		return coinValue;
	}
	
	public void setValue(int newValue){
		coinValue = newValue;
	}
	
	public int getFace()
	{
	    if (isHeads()) {
	                    return HEADS;
	                }
	                return TAILS;
	}

	public void setFace( int newFace){
	    while (newFace!= getFace()) {
	                     flip();
	                }
	      }
	
	public String toString(){
		return super.toString();
	}
}
