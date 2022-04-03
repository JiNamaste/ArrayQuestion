package array;

public class MaximumSubArraySum {
static int maximumSum(int [] arr) {
	int res =arr[0];
	int endpoint = arr[0];
	for(int i=0;i<arr.length;i++) {
		endpoint = Math.max(endpoint+arr[i], arr[i]);
		res = Math.max(endpoint, res);
	}
	
	
	
	
	
	
//	int res=arr[0];
//    int maxEnding = arr[0];
//    
//    for(int i=1;i<arr.length;i++) {
//    	maxEnding = Math.max(maxEnding + arr[i], arr[i]);
//    	res = Math.max(maxEnding, res);
//    	
//    }
    return res;
}
	public static void main(String[] args) {
		int [] a = {-3,8,-2,4,-5,6};
		System.out.println(maximumSum(a) );
	}

}
