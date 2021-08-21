package sorting.algo;

import java.util.Scanner;

public class Array {
	// Method to get size of the Array from the user.
	public int setArraySize()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array you want  : ");
		int n = sc.nextInt();
		return n;
	}
	
	// Method to create an Array of given size.
	public int[] setArray(int n) 
	{
		Scanner sc =  new Scanner(System.in);
		int[] arr = new int[n];
		for(int i=0; i<n; i++) 
		{
			System.out.print("\nEnter "+(i+1)+" Element of the Array  :  ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	// Method to display the Array Elements
	public void display(int arr[] , int n)
	{
		for(int i=0; i<n;i++)
		{
			System.out.print(arr[i]+"    ");
		}
	}
	
}
