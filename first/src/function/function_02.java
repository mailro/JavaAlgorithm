package function;

import java.util.Scanner;

public class function_02 {
	public static int num(int n) {
		int dn = n;
		while(n!=0) {
			dn = dn + (n%10);
			n = n/10;
		}
		return dn;
		
	}
	
	public static void main(String[] args) {
		boolean[] noSelfNum = new boolean[10001];
		for(int i =0; i<10001; i++) {
			int dn = num(i);
			if(dn <= 10000) {
				noSelfNum[dn] = true;
			}
		}
		for (int i = 0; i < noSelfNum.length; i++) {
			if(!noSelfNum[i]) {
				System.out.println(i);
			}
		}
	}


}
