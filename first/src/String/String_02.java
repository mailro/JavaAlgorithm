package String;

import java.util.Scanner;

public class String_02 {
	//백준 11720번 문제. (숫자의 합)
	//문자열 문제 2번째 문제.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] ay = scn.next().split("");
		int sum = 0;
		int[] y = new int[n];
		
			for(int i = 0; i < n; i++) {
				
				y[i] = Integer.parseInt(ay[i]);
				
				sum += y[i];
				
			}
	
		System.out.println(sum);
		
	}

}
