package arrays.demo;

public class DataTypes {

	public static void main(String[] args) {
		// short byte[] int[] long[] float[] double char String
		// short[]
		
		char ch[];
		ch = new char[10];
		ch[0]='0';
		ch[1]='1';
		ch[2]='2';
		ch[3]='3';
		ch[4]='4';
		ch[5]='a';
		ch[6]='b';
		ch[7]='c';
		ch[8]='d';
		ch[9]='e';
		
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
		}
	
	}

}
