package bynary.operators;

public class ForLoop2 {

	public static void main(String[] args) {
		
		
		/*
		 * 1
		 * 1 0// 1,, 2
		 * 1 0 1// 1 , 2 3
		 * 1 0 1 0
		 * 1 0 1 0 1  
		 *  
		 *  
		 *  	
		 */
			for(int r=1;r<=5;r++) {
				for(int c=1,t;c<=r;c++) {
					if(c % 2 == 0) t =0;
					else t = 1;
					System.out.print(t+" ");
					
				}
				System.out.println();
			}
	}

}
