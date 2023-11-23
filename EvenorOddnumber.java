package bynary.operators;

public class EvenorOddnumber {

	
		static boolean isNumEvenOrOdd(int a){
			if(a % 2 == 0) return true;
			else return false;
		}
		
		public static void main(String[] args) {
			
		// num is even or odd using method...
			int num =18;
			// num is even or odd----> true/false
			
			System.out.println("Result---->"+isNumEvenOrOdd(num));
	}

}
