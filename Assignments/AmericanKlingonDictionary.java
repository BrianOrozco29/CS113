package Assignments;

public class AmericanKlingonDictionary extends Dictionary
{
	private String publisher, isbn;
	private int year;
	
	public void setPublisher(String newPub)
	{
		publisher = newPub;
	}
	
	public String getPublisher()
	{
		return publisher;
	}
	
	public void setISBN(String isbnNum)
	{
		isbn = isbnNum;
	}
	
	public String getISBN()
	{
		return isbn;
	}
	
	public void setYear(int newYear)
	{
		year = newYear;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public String toString()
	{
		return "Publisher: " + publisher + '\n' + "ISBN: " + "\n" + "Year: " + year;
	}
}
