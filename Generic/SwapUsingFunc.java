import java.util.*;
import java.lang.*;
import java.io.*;

/* Swap two numbers using a method swap */
class SwapUsingFunc
{
	//Swap two numbers 
	public void swap(int[] arr, int element1, int element2){
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x");
		int x = scanner.nextInt();
		System.out.println("Enter y");
		int y = scanner.nextInt();
		int[] array = {x,y};
		System.out.println("After swapping:");
		SwapUsingFunc suf = new SwapUsingFunc();
		suf.swap(array, x, y);
	}
}
