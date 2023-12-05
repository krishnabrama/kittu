package demo.arrays;

public class ElementsCopy1 {

	public static void main(String[] args) {
		//Program to Copy All the Elements of A and B into C Array
		int[] a = {10,20,30,40,50,60};
		int[] b = {12,10,20,303,405,500};
		int[] res = new int[a.length+b.length];
		// a u b ----> 10 20 30 40 50 60,12,303,405,500 
		// copy a elemenst
		int resIndex=0;
		for(int i=0;i<a.length;i++,resIndex++) {
			res[resIndex] = a[i];
			
		}
		// copy b  elements
		boolean isFound = false;
		for(int i=0;i<b.length;i++) {
			 isFound = false;
			for(int j=0;j<a.length;j++) {
				if(b[i] == a[j]) {
					isFound = true;
				}
			}// j
			if(isFound == false) {
				res[resIndex++] = b[i];	
			}
			
		}// i
		
		
		for(int i=0;i<resIndex;i++) {
			System.out.print(res[i]+" ");
		}
				
		
		}

	

	}


