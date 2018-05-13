package Assignments;

public class Homework3Test {

	public static void main(String[] args) {
		Homework3 test = new Homework3();
		int surf = test.surface(4, 2, 5);
		double tri = test.rightTriangle(5, 10);
		boolean pal = test.isPalindrome("poop");
		
		System.out.println(surf + "\n" + tri + "\n" + pal);
	}

}
