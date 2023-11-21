package bynary.operators;

public class EvenAndOddS {

	public static void main(String[] args) {
	
		/*
		 * 1 2 3 4 5
		 * 1 2 3 4
		 * 1 2 3
		 * 1 2 
		 * 1 	
		 */
			for(int r=5;r>=1;r--) {// 3
				
				for(int c=1;c<=r;c++) {// 3
					System.out.print(c+" ");
				}
				System.out.println();
			}
			
		
		}


	}


