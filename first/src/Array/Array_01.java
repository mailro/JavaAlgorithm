package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();  //배열의 크기 입력
		int a[] = new int[N]; //배열 생성
	
		for(int i = 0; i<a.length; i++) {
			int num = scn.nextInt();//배열에 들어갈 값 입력
			a[i] = num; //배열에 값넣기
			
		}
		Arrays.sort(a);
		System.out.print(a[0] + " " + a[N-1]);

	}

}
