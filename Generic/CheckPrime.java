import java.util.*;
import java.lang.*;
import java.io.*;

/* To check whether a given number is prime or not. */
class CheckPrime
{
	// Returns true if the given number is prime otherwise false
	public boolean isPrime(int num){
		if(num <= 1){
			return false;
		}
		for(int i=2; i<Math.sqrt(num); i++){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is prime or not");
		String input = scanner.nextLine();
		int x = Integer.parseInt(input);
		CheckPrime p = new CheckPrime();
		System.out.println(p.isPrime(x));
	}
}
