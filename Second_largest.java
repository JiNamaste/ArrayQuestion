package array;

public class Second_largest {

	static int second_small(int [] arr) {
		int n =arr.length;
		if (n < 2)
		{
			return -1;
		}
		int small = Integer.MAX_VALUE;
		int second_small = Integer.MAX_VALUE;
		int i;
		for (i = 0; i < n; i++)
		{
		   if (arr[i] < small)
		   {
			  second_small = small;
			  small = arr[i];
		   }
		   else if (arr[i] < second_small && arr[i] != small)
		   {
			  second_small = arr[i];
		   }
		}
	   return second_small;
	}
	
	static private int secondLargest(int[] arr)
	{
		int n =arr.length;
		if(n<2)
		return -1;
		int large= Integer.MIN_VALUE;
		int second_large=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]>large) {
				second_large=large;
				large=arr[i];
				}else if(arr[i]>second_large || arr[i]>large) {
					second_large= arr[i];
				}
		}
		return second_large;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 4, 6, 7, 5};
		
		System.out.println(second_small(arr));
		System.out.println(secondLargest(arr));
	}

}
