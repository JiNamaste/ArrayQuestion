package array;

import java.util.ArrayList;
import java.util.Collections;

public class Leader {
	static ArrayList<Integer> leader(int arr[]) {
		int n= arr.length;
ArrayList<Integer> a = new ArrayList<>();

int current =arr[n-1];
a.add(current);
		for(int i=n-2;i>=0;i--) {
			if(current <arr[i]) {
				current = arr[i];
				a.add(current);
			}
			
		}
		Collections.reverse(a);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7, 10, 4, 10, 6, 5, 2};
	System.out.println(	leader(arr));
	}

}
