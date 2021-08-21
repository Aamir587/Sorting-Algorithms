package sorting.algo;

import java.util.Scanner;

public class BubbleSort {

	// method to perform Bubble Sort
	public void bubbleSort(int arr[] , int n)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n-1-i;j++ )
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Array a = new Array();
		BubbleSort  bs  = new BubbleSort();
		int n= a.setArraySize();
		int arr[] = a.setArray(n);
		System.out.println("\nArray Before Sorting -  ");
		a.display(arr, n);
		bs.bubbleSort(arr, n);
		System.out.println("\nArray After Sorting -  ");
		a.display(arr, n);
	}
}
