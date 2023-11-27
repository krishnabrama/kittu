package bynary.operators;

public class StringIsPalindrome {

	public static void main(String[] args) {
		// 9889
				// 9889
				
				String str = "1234";
				String newStr = "";
				
				for(int i=str.length()-1;i>=0;i--) {
					newStr = newStr + str.charAt(i);
				}
				System.out.println("old Str--->"+str);
				
				System.out.println("new Str--->"+newStr);
				if(str.contentEquals(newStr)) {
					System.out.println("It is polyndrome....");
				}
				else {
					System.out.println("Not polyndrome....");
						
				}
						
						
				
			}

		
	}


