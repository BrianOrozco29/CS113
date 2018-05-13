package Assignments;

public class Homework3 {
	
	public int surface(int length, int width, int depth){
		
		return (2 * (length * width)) + (4 * (length * depth));
	}
	
	public double rightTriangle(double sideA, double hypotenuseB){
		return Math.sqrt(Math.pow(hypotenuseB, 2) - Math.pow(sideA, 2));
	}
	
	public boolean isPalindrome(String word){
		int wordLen = word.length();
		for (int i = 0; i < (wordLen / 2) + 1; i++){
			if (word.charAt(i) != word.charAt(wordLen - i - 1)){
				return false;
			}
		}
		return true;
	}
}
