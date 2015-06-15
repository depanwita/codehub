import java.util.*;
import java.lang.*;
import java.io.*;

/* To calculate fibonacci series upto how many numbers */
class FibonacciSeries
{
	//Calculate fibonacci number using recursion
	public int fibonacci(int num){
		if(num == 1 || num == 2){
			return 1;
		}
		return fibonacci(num-1) + fibonacci(num-2);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to calculate fibonacci series");
		String str = scanner.next();
		int num = Integer.parseInt(str);
		if(num == 0){
			System.out.println(num);
		}
		FibonacciSeries fs = new FibonacciSeries();
		for(int i=1; i<=num; i++){
		System.out.println(fs.fibonacci(i));
		}
	}
}
