package bynary.operators;

public class PrimeorNotype4 {

	
		static boolean toFindNumPrimeOrNot(int n){
			int i=2;
			boolean res = true;
			
			for(;(i<n/2) && (n % i != 0);i++);
			
			if(i < n/2) res = false;
			return res;
		}
		public static void main(String[] args) {
		
			
			
			for(int i=300;i<=500;i++) {
				if(toFindNumPrimeOrNot(i) == true) {
					System.out.print(i+" ");
		
				}
			}

	}

}
