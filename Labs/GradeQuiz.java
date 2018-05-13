package labs;
import java.util.*;
public class GradeQuiz {

	public static void main(String[] args) {
		boolean a = true;
		while(a == true){
			Scanner user = new Scanner(System.in);
			System.out.println("How many questions are on the quiz?");
			int questions = user.nextInt();		
			int[] correct = new int[questions];
			int i = 1;
			int answer;
			
			for(int j = 0; j < questions; j++){
				System.out.println("What is the answer to question " + i + "?");
				correct[j] = user.nextInt();
				i++;
			}
			
			int count = 0;
			i = 1; 
			for(int j = 0; j < questions; j++){
				System.out.println("What is the student's answer for question " + i + "?");
				answer = user.nextInt();
				i++;
				if(answer == correct[j]){
					count++;
				}
			}
			
			double percent = (double) count / questions * 100;
			System.out.println("This student got " + count + " questions correct.");
			System.out.println("The score is a " + percent + "%");
			
			System.out.println("Do you want to grade another quiz? (y/n)");
			user.nextLine();
			String more = user.nextLine();
			
			if(more.equals("y"))
				a = true;
			else
				a = false;
		}
	}
}
