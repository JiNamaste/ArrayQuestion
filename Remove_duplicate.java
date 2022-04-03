package array;

import java.util.*;

public class Remove_duplicate {

	static void remove(int [] arr){
		Set<Integer> s = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(!s.contains(arr[i])) {
				s.add(arr[i]);
			}
		}
		System.out.print(s);
		
	}
	
	static int remove_duplicate(int [] arr) {
		int res =1;
		for(int i=1;i<arr.length;i++) {
			if(arr[res-1] != arr[i]) {
				arr[res]=arr[i];
				res++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 20, 30, 30, 30};
		remove(arr);
	int n =	remove_duplicate( arr);
	System.out.println();
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
	}

}
