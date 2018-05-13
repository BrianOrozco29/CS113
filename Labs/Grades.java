package labs;

public class Grades {
	
	public static void main(String[] args) {
		Student sally, joe;
		sally = new Student("Sally");
		joe = new Student("Joe");
		
		System.out.println(sally.getName() + "'s average is " + sally.getAverage());
		System.out.println(joe.getName() + "'s average is " + joe.getAverage());
	}

}
