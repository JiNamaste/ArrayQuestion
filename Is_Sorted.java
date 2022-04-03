package array;

public class Is_Sorted {
	static boolean is_sorted(int [] arr) {
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]>arr[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5};
		int [] arr1 = {1,2,9,4,8};
		
		System.out.println(is_sorted(arr));
		System.out.println(is_sorted(arr1));
	}

}
