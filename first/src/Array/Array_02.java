package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int ay[] = new int[9];
		int cnt = 0;
		int max = 0;
		for(int i = 0; i<ay.length; i++) {
			int num = scn.nextInt();
			ay[i] = num;
			if(ay[i] > max) {
				max = ay[i];
				cnt=i+1;
			}

		}

		Arrays.sort(ay);
		System.out.println(ay[8]);
		System.out.println(cnt);
	}

}
