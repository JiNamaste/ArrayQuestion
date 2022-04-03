package array;

public class StockBuy_AndSell {
 static int  maxProfit(int [] a) {
	 int profit=0;
	 for(int i=1;i<a.length;i++) {
		 if(a[i]>a[i-1]) {
			 profit= profit +(a[i]-a[i-1]);
		 }
	 }
	 return profit;
 }
	public static void main(String[] args) {
		int [] a = {25,3,7,18};
System.out.println(maxProfit(a));
	}

}
