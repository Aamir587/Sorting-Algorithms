package sorting.algo;

public class InsertionSort {

	// method to perform insertion sort.
	public void insertionSort(int arr[] , int n)
	{
		for(int i=1; i<n; i++)
		{
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]  = arr[j];
				j= j-1;
			}
			arr[j+1] = temp;
		}
	}
	
	public static void main(String[] args) {
		Array a = new Array();
		InsertionSort  is  = new InsertionSort();
		int n= a.setArraySize();
		int arr[] = a.setArray(n);
		System.out.println("\nArray Before Sorting -  ");
		a.display(arr, n);
		is.insertionSort(arr, n);
		System.out.println("\nArray After Sorting -  ");
		a.display(arr, n);
	}
 }
