package bynary.operators;

public class SumOfDigits {

	public static void main(String[] args) {
		int n=258910;//9.... 0
		// 2+5==7
		int res = findSum(n);
		System.out.println("Total Sum--->"+res);
	}

	private static int findSum(int n) {
		int r,sum=0;
		while(n>0) {
			r = n % 10;// 25 % 10----5
			sum = sum + r;
			n = n/10;// 25/10-----2
		}
		
		return sum;
	
	
	
	
	}
	
	

}
