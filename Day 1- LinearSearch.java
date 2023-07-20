// Time Complexity - O(n)
// Space Complexity - O(1)

public class LinearSearch
{
	private static void linearSearch(int arr[], int num){
		for(int i = 0;i<arr.length;i++){
            		if(arr[i]==num){
                	System.out.println(num + " is found at " + i);
                	return;
            		}
        	}
        System.out.println("number not found");
   	}
  	public static void main(String[] args) {
		int[] arr = {10,43,65,12,6,3};
		int num = 6;
		linearSearch(arr, num);
	}
}
	
