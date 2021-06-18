package Array;


import java.util.Scanner;

public class Array_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] ay = new String[scn.nextInt()];
		
		for(int i=0; i<ay.length; i++) {
			ay[i] = scn.next();
		}
		scn.close();
		
		for(int i=0; i<ay.length; i++){
			int cnt = 0;
			int sum = 0;
			for(int j=0; j<ay[i].length(); j++) {
				if(ay[i].charAt(j) =='O') { //문자열 계속돌음
					cnt++; //0일때 cnt점수 1씩 증가.
				} else {
					cnt = 0;//X가 나오면 cnt 0으로 초기화
				}
				sum += cnt; //점수 총합계
			}
			System.out.println(sum);
		}
	}
}

		
