import java.util.*;
import java.lang.*;
import java.io.*;

/* Merge two unsorted array and bubble sort after that */
class BubbleSort
{
	private int[] mergeArr;
	
	//It takes two array and reurns a merged array
	public void mergeArray(int[] arr1, int[] arr2){
		int size = arr1.length + arr2.length;
		mergeArr = new int[size];
		int j = 0;
		for(int i=0; i<size; i++){
			if(i<arr1.length){
				mergeArr[i] = arr1[i];	
			}
			if(i==arr1.length || i>arr1.length){
				mergeArr[i] = arr2[j];
				j++;
			}
		}
		System.out.println("After marging:");
		for(int k=0; k<size; k++){
			System.out.println(mergeArr[k]);
		}
	}
	
	//It takes two unsorted array and returns a sorted array using bubble sort
	public void bubbleSort(int[] arr1, int[] arr2){
		mergeArray(arr1, arr2);
		int n = mergeArr.length;
		int temp = 0;
		for(int i=0; i<n; i++){
			for(int j=1; j<n-i; j++){
				if(mergeArr[j-1]>mergeArr[j]){
					temp = mergeArr[j-1];
					mergeArr[j-1] = mergeArr[j];
					mergeArr[j] = temp;
				}
			}
		}
		System.out.println("Array after bubble sort");
		for(int k=0; k<n; k++){
			System.out.println(mergeArr[k]);
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number of integer for the first array");
		int input1 = in.nextInt();
		System.out.println("Enter a number of integer for the second array");
		int input2 = in.nextInt();
		int[] array1 = new int[input1];
		System.out.println("Enter "+input1+ "integers for the first array");
		for(int i=0; i<input1; i++){
			array1[i] = in.nextInt();
		}
		int[] array2 = new int[input2];
		System.out.println("Enter "+input2+ "integers for the second array");
		for(int j=0; j<input2; j++){
			array2[j] = in.nextInt();
		}
		BubbleSort bs = new BubbleSort();
		//bs.mergeArray(array1, array2);
		bs.bubbleSort(array1, array2);
	}
}
