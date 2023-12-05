package arrays.demo;

public class Elementscopy {

	public static void main(String[] args) {
		//Program to Copy All the Elements
		//of One Array to Another Array
		int[] a = {10,20,30,40,50,60};
		int[] b = new int[a.length];
		
		
		
		for(int i=0;i<a.length;i++) {
			b[i] = a[i];
		}
		System.out.println("A array Elements----->");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nB array Elements----->");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}

	}

}
