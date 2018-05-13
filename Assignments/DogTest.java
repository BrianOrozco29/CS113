package Assignments;

//****************************************************************
//DogTest.java
//
//A simple test class that creates a Dog and makes it speak.
//
//****************************************************************
public class DogTest
{
	public static void main(String[] args){
		Labrador dog2 = new Labrador("Max", "black");
		System.out.println(dog2.getName() + " says " + dog2.speak());
		
		Yorkshire dog3 = new Yorkshire("Monster");
		System.out.println(dog3.getName() + " says " + dog3.speak() + " my weight is " + dog3.avgBreedWeight());

	}
} 