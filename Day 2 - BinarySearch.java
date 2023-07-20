// Time Complexity - O(logn)
// Space Complexity - O(1)

public class BinarySearch
{
    public static int bSearch(int arr[], int start, int end, int elem){
        if(start <= end) {
          int mid = start + ((end-start)/2);
          if(arr[mid] == elem)
              return mid ;
          else if(arr[mid] > elem)
              return bSearch(arr, start, mid-1, elem);
          else
              return bSearch(arr, mid+1, end, elem);
        }
        else
            return -1;
    }

	  public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60,70,80,90};
		int elem = 60;
		int n = arr.length;
		int pos = bSearch(arr, 0, n-1, elem);
		if(pos == -1)
		    System.out.println("Element is not found");
		
		else
		    System.out.println("The element " + elem + " is found at " + pos);
	  }		
}
