package array;
import java.util.Scanner;
import java.util.Arrays;

public class Largest {
	public static int largest(int arr[]) {
		int lar =0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]>lar) {
				lar = arr[i];
			}
		}
		return lar;
	}

//	public static void largest(int arr[]) {
//		int n = arr.length;
//		Arrays.sort(arr);
//		
//		System.out.print(arr[n-1] + " "+arr[n-2]);
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
	System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(largest(arr));
		
		
	}

}
