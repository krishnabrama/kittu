package arrays.demo;

public class FindLargestElementinArray {

	public static void main(String[] args) {
		// Program to Find the 
				//Largest Element in an Array
				int[] num = {10,23,47,999,123,456,3,2,1,99};
				//987
				int max = num[0];// 999
				int min = num[0];// 999
				
				
				for(int i=1;i<num.length;i++) {
					if(num[i] > max) {
						max = num[i];
					}
					if(min > num[i]) {
						min = num[i];
					}
				}
				System.out.println("Max Value--->"+max);
				System.out.println("Min Value--->"+min);
				
				}

			}
	


