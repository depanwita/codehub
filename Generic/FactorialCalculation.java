import java.util.*;
import java.lang.*;
import java.io.*;

/* Calculates factorial of a given number by recursion and iteration. */
class FactorialCalculation
{
	//Returns factorial of a given number
	public int factorialByRecursion(int num){
		if(num == 0 || num == 1){
			return 1;
		}
		return num * factorialByRecursion(num-1);
	}
	//Returns factorial of a given number
	public void factorial(int num){
		long result = 1;
		for(int i=2; i<=num; i++){
			result *= i;
		}
		System.out.print(result);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to calculate the factorial");
		String input = scanner.nextLine();
		int x = Integer.parseInt(input);
		FactorialCalculation fac = new FactorialCalculation();
		System.out.println("Result using recursion " + fac.factorialByRecursion(x));
	    System.out.println("Result using iteration ");
	    fac.factorial(x);
	}
}
