package array;

public class MaxevenoddSubarray {

	static int maxlength(int [] a) {
		int res =1;
		int count = 1;
	for(int i=1;i<a.length;i++) {
		if(a[i]%2==0 && a[i-1]%2!=0 ||a[i]%2!=0 && a[i-1]%2==0 ) {
			count++;
			res = Math.max(count, res);
		}else {
			count =1;
		}
	}
	return res;
	}
	public static void main(String[] args) {
		int a [] = {5,10,20,6,3,8};
		System.out.println(maxlength(a));

	}

}
