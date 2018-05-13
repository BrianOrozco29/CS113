package labs;

//*******************************************************************
//Fib.java
//
//A utility class that provide methods to compute elements of the
//Fibonacci sequence.
//*******************************************************************
public class Fib
{
	//------------------------------------------------------------------
	//Recursively computes fib(n)
	//------------------------------------------------------------------
	public static int fib1(int n)
	{
	//Fill in code -- this should look very much like the
	//mathematical specification
		if (n == 1){
			return 1;
		}
		else if (n == 2){
			return 1;
		}
		else{
			return fib1(n-1) + fib1(n-2);
		}
	}
}