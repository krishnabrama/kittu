package bynary.operators;

public class FindMaxValue {

	
		static int  findMax(int x,int y,int z){
			
			if ( (x>y) && (x>z)) {
				return x;
			}
			else if(y>z) {
				return y;
			}
			else {
				return z;
			}
		}
		public static void main(String[] args) {
			int a=18,b=445,c=85;
			System.out.println("Max Value--->"+findMax(a,b,c));
			
	}

}
