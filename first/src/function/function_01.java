package function;

import java.util.Scanner;

public class function_01 {
	
	static long sum(int[] a ) {
		long ans = 0;
		for(int i=0; i < a.length; i++) {
			ans+=a[i];
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int[] b = new int[num];
		for(int i = 0; i<b.length; i++) {
			b[i] = scn.nextInt();
			System.out.println(sum(b));
		}
	}

}
