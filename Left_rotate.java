package array;

public class Left_rotate {
	static void left_rotation(int [] arr,int n,int d) {
		int [] temp =new int[d];
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}
		for(int i=d;i<n;i++) {
			arr[i-d]=arr[i];
		}
		for(int i=0;i<d;i++) {
			arr[n-d+i]=temp[i];
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5} ,n=5,d=2;
		left_rotation( arr, n,d);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
