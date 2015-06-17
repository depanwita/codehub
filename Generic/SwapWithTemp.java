import java.util.*;
import java.lang.*;
import java.io.*;

/* Swap two numbers using a temporary variable*/
class SwapWithTemp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x");
		int x = scanner.nextInt();
		System.out.println("Enter y");
		int y = scanner.nextInt();
		int z = x;
		x = y;
		y = z;
		System.out.println("After swapping with temporary variable:");
		System.out.println(x);
		System.out.println(y);
	}
}
