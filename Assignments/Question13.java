package Assignments;
/*
Implement a method named rangeArray() that takes three parameters:
1. alpha, an integer array
2. first, an integer
3. last, an integer bigger than first
 */
public class Question13 {
	
	public int[] rangeArray(int[] alpha, int first, int last){
		int[] result;
		if (first>=0 && last <= alpha.length){
			result = new int[last - first + 1];
			for(int i = 0; i<result.length; i++){
				result[i] = alpha[first];
			}
		}
		
		else{
			result = new int[5];
			for(int i = 0; i<result.length; i++){
				result[i] = (int) (Math.random() * (last-first+1));
			}
		}
		return result;
	}
}
