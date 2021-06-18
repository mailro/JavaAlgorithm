package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_04 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int ay[] = new int[10];
		int cnt = 1;
		for(int i =0; i<ay.length; i++) {
			ay[i] = scn.nextInt() % 42;
		}
		
		Arrays.sort(ay);
		
		for(int i=0; i<ay.length-1; i++) {
			if(ay[i] != ay[i+1]) {
				cnt++;
			}
		}
		
		
		
		System.out.println(cnt);
	}

}
