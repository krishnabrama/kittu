package bynary.operators;

public class PrimeorNot {

	
		static boolean toFindNumPrimeOrNot(int n){
			boolean isPrime = true;
			// 14587901/ 2----11
			// 2 3 4 5 6 7 8 9 10 11
			// 12 13 14.15 16 17. 18.19 20. 21. 22
			
			for(int i=2;i<n/2;i++) {
				if( n % i == 0) {
					isPrime = false;
					break;
				}
			}
			return isPrime;
		}
		public static void main(String[] args) {
		
			int num =29;
			System.out.println("Result----->"+toFindNumPrimeOrNot(num));

	}

}
