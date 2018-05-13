package Assignments;

public class MainDictionary 
{
	public static void main(String[] args)
	{
		Dictionary dict = new Dictionary();
		dict.setPages(1500);
		System.out.println("Dictionary: " + "\n" + "Pages: " + dict.getPages());
		System.out.println("Definitions: " + dict.getDefinitions() + "\n");
		
		AmericanKlingonDictionary dict2 = new AmericanKlingonDictionary();
		dict2.setPages(1000);
		dict2.setDefinitions(10000);
		dict2.setPublisher("Star Trek");
		dict2.setISBN("978-0671745592");
		dict2.setYear(1992);
		System.out.println("American Klingon Dictionary: " + "\n" + dict2.toString());
	}
}
