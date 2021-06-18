package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int[] cnt = new int[num];
		int count = 0;
		double avg = 0.0;
		int score = 0;
		
		for(int i=0; i<cnt.length; i++) {
			
			cnt[i] =  scn.nextInt();
			count++;
		}
		
		Arrays.sort(cnt);
		for(int i=0; i<cnt.length; i++) {
			int a = cnt[i];
			int b = cnt.length-1;
			int c = cnt[b];
			System.out.println((double)a / (double)c * 100);
			avg += (double)a / (double)c * 100;
		}
		System.out.println(avg/count);
		scn.close();
		
		
		
	}

}
