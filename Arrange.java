package array;

public class Arrange {
	
	public static void arrange(int arr[] , int n) {
	int left=0;
	int right = n-1;
	int counter =1;
	while(left<=right) {
		if(counter%2==1) {
			arr[left]=counter;
			counter= counter+1;
			left = left+1;
			}else {
				arr[right] = counter;
				counter=counter+1;
				right = right -1;
			}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr []= {1,2,3,4,5};
		int n = arr.length;
	arrange(arr,n);
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
		
		

	}

}
