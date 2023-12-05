package arrays.demo;

public class Arrays1 {

	public static void main(String[] args) {
		int num1,num2,num3,num4,num5;
		int[] num = {
				10,21,35,72,89,
				10,21,11,72,89,
				10,21,5,11,72,89,
				10,21,5,11,72,89
				};
		System.out.println("total elements--->"+num.length);
		//num[0] num[1],num[2],num[3],num[4]
		for(int i=0;i<num.length;i++) {
			System.out.println("num["+i+"]--->"+num[i]);
		}
	}

}
