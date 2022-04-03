package array;

public class MajorityElement {
  static int findMajority(int [] arr, int n) {
	  for(int i=0;i<n;i++) {
		  int count =1;
		  for(int j=1;j<n;j++) {
			  if(arr[i]==arr[j]) {
				  count++;
			  }
		  }
		  if(count >n/2) {
			  return arr[i];
		  }
	  }
	  return -1;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {8, 7, 6, 8, 6, 6, 6, 6}, n = 8;

	       System.out.println(findMajority(arr, n));

	}

}
