package Assignments;
/*
Write an application TestBook that creates two Book objects with the following specifications,
book1: title="Java Software Solutions" , pages is user input
book2: title="Beginning with Python" , pages=356

The application prints to the screen the average number of pages of the two books.
It then creates a third book with a title that combines titles of book1 and book2 and 
the minimum number of pages among book1 and book2 and prints to the screen the info
about that book.
 */
import java.util.*;
public class TestBook {
	public static void main(String[] args){
		Scanner user = new Scanner(System.in);
		System.out.println("What is the # of pages for \"Java Software Solutions\"?");
		int numPages = user.nextInt();
		
		Book book1 = new Book(numPages, "Java Software Solutions");
		Book book2 = new Book(356, "Beginning with Python");
		
		System.out.println("The average # of pages of the two books is " + (book1.getPages()+book2.getPages()) / 2.0);
		
		String newTitle = book1.getTitle() + " " + book2.getTitle();
		int minPages = book1.getPages() <= book2.getPages()? book1.getPages():book2.getPages();
		
		Book book3 = new Book(minPages, newTitle);
		System.out.println(book3);
	}
}
