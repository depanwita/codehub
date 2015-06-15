import java.util.*;
import java.lang.*;
import java.io.*;

/* Fibonacci series like 1,1,2,3,5,8,13...each subsequent number is the sum of previous two numbers  */
class Fibonacci
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//Calculating only positive integers
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to get a fibonacci series");
		String str = scanner.next();
		int num = Integer.parseInt(str);
		if(num == 0){
			System.out.println(num);
		}
		if(num == 1){
			System.out.println(num);
		}
		int x = 1;
		int y = 1;
		int z = 1;
		if(num == 2){
			System.out.println(x);
			System.out.println(y);
		}
		if(num > 2){
			System.out.println(x);
			System.out.println(y);
			for(int i=3; i<=num; i++){
				z = x+y;
				x = y;
				y = z;
				System.out.println(z);
			}	
		}
		
	}
}
