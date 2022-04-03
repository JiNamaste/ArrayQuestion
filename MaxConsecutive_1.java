package array;

public class MaxConsecutive_1 {
	static int count(int [] arr)
	{
		int count =0;
		int res =0;
		for(int i =0 ;i<arr.length;i++) {
			if(arr[i]==0) {
				count =0;
			}else {
			count++;
			res =Math.max(count, res) ;}
			
		}
		return res;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,1,1,0,1,0};
		System.out.println(count(a) );
		

	}

}
