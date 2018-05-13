package Assignments;

public class TestPractice
{
 public static public void main (String[] args)
 {
 final int MIN=0;
 String[] values={“7”, “3”, “this”, “5”};
 SmallNumberException problem=new SmallNumberException("Too small.");
 for (int i=0;i<values.length;i++)
 {
 try{
 if (Integer.parseInt(values[i])<MIN) throw problem;
 System.out.print(Integer.parseInt(values[i])%2+ " ");
 }
 catch (SmallNumberException e){
 System.out.println(e.getMessage());
 }
 catch (NumberFormatException e){
 System.out.println("not a number");
}
 }
}
}