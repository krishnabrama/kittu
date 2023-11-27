package bynary.operators;

public class RiverseString {

	public static void main(String[] args) {
		String str = "123456789";
		String newStr = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			newStr = newStr + str.charAt(i);
		}
		
		System.out.println("New String---->"+newStr);
				
				
		
	}

	}



