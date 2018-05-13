package Assignments;

public class PascalsTriangle {
	public static void nthLine(int list[], int nthLine) { 
		int newList[] = new int[list.length + 1]; 
		newList[0] = 1;

		for (int i = 1; i < list.length; i++){
			newList[i] = list[i - 1] + list[i]; 
		}
		
		newList[newList.length - 1] = 1; 

		for (int i = 0; i < newList.length; i++){ 
			System.out.print(newList[i] + " ");
		}
		
		System.out.println();
		
		if (newList.length < nthLine){ 
			nthLine(newList, nthLine); 
		}		
	}
	
	public static void main(String[] args){
		int numList[] = new int[0];
		nthLine(numList, 10);
	}
	
}
