import java.util.*;
import java.lang.*;
import java.io.*;

/* Swap two numbers without using temporary variable*/
class Swap
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x");
		int x = scanner.nextInt();
		System.out.println("Enter y");
		int y = scanner.nextInt();
		//Swapping without temp variable
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("After swapping without temporary variable:");
		System.out.println(x);
		System.out.println(y);
	}
}
