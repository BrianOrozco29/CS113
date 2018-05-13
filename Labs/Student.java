package labs;
import java.util.Scanner;

public class Student {
	private String name;
	private double test1, test2;
	
	public Student (String student)
	{
		name = student;
		inputGrades();
	}
	
	public String getName()
	{
		return name;
	}
	
	public void inputGrades()
	{
		Scanner user = new Scanner(System.in);
		System.out.println("What is " + name + "'s grade for test 1?");
		test1 = user.nextInt();
		System.out.println("What is " + name +"'s grade for test 2?");
		test2 = user.nextInt();
	}
	
	public double getAverage()
	{
		double average = (test1 + test2) / 2;
		return average;
	}	
}
