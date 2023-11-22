package bynary.operators;

public class ForLoop1 {

	public static void main(String[] args) {
		
		/*
		 * 1
		 * 1 0
		 * 1 0 1
		 * 1 0 1 0
		 * 1 0 1 0 1  
		 *  
		 *  
		 *  	
		 */
			for(int r=1;r<=5;r++) {
				for(int c=1,v=1;c<=r;c++) {
					System.out.print(v+" ");
					if(v == 1) v=0;
					else v = 1;
				}
				System.out.println();

		
			}
		
	}

}
