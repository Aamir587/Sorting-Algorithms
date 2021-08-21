package sorting.algo;

public class SelectionSort {
	//method to perform Selection Sort.
	public void selectionSort(int arr[] , int n)
	{
		int min;
		for(int i=0; i<n; i++) { 			// traversing each element from starting index 0.
			min = i;					    // Considering  i'th element as mininum,
			for(int j=i+1; j<n; j++) {      // traversing to the nex element than i'th;
				if(arr[j]<arr[min])		// comparing whether the next element is smaller than min.
				{
					min=j;				// changing the index of the minimum element.
				}
			}
			int temp = arr[min];		//now swapping the minimum element to the sorted array part.
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		Array a = new Array();
		SelectionSort  ss  = new SelectionSort();
		int n= a.setArraySize();
		int arr[] = a.setArray(n);
		System.out.println("\nArray Before Sorting -  ");
		a.display(arr, n);
		ss.selectionSort(arr, n);
		System.out.println("\nArray after Sorting -  ");
		a.display(arr, n);
		
	}

}
