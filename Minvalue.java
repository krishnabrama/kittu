package bynary.operators;

public class Minvalue {

	public static void main(String[] args) {
		int n=2539;//9.... 0
		// 2+5==7
		int max = findMin(n);
	
		System.out.println("MAx value---->"+max);
	}

	private static int findMin(int n) {
		// 0..1..2....9
		int min=9,r;
		while(n > 0) {// 2589
			r = n % 10;// 8
			n = n/10;
			if(r < min) min= r;// 8> 9
		}
		
		return min;
	}

	

	}


