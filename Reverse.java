package array;
import java.util.*;


class Reverse {
	static void reverse(int []arr) {
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
		int low=0;
		int high =arr.length-1;
		while(low<high) {
			int temp =arr[low];
			arr[low] = arr[high];
			arr[high]=temp;
			
			low++;
			high--;
		}
	}
	
	
	
	public static void main (String[] args) {
		//code
		int [] arr = {1,2,3,4,5};
		
		reverse(arr);
		for(int i =0;i<arr.length;i++){
		    System.out.println(arr[i]);
		}
		
	}
}