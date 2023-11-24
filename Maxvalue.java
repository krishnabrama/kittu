package bynary.operators;

public class Maxvalue {

	public static void main(String[] args) {
	
		int n=10101;//9.... 0
		// 2+5==7
		int max = findMax(n);
	
		System.out.println("MAx value---->"+max);
	}

	private static int findMax(int n) {
		// 0..1..2....9
		int max=0,r;
		while(n > 0) {// 2589
			r = n % 10;// 8
			n = n/10;
			if(r > max) max= r;// 8> 9
}
		
		return max;
		
		}
		
		
	}


