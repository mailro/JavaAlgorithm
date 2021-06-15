package first;

import java.util.Scanner;

public class while_04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
       int cnt =0;
        int x = N;
		while (true) {
			// 값 / 26이 입력되면  a값은 2
			int a = x / 10;  // 첫자리수
			// 나머지 % 26이 입력되면 b값은 6
			int b = x % 10; // 뒷자리 수
			int sum = a+b; // 처음에 더하기값을 구했음. 즉 새로운 수의 뒷자리값.
			//2+6을 해서 sum값이 8이 됐다
			//새로운 수는 b값 6에 10을 곱하고 sum을더하면  68이 되고 이 값이 입력값을 대신해야한다.
			//이 새로운 값이 입력값과 다르면 위에서부터 다시 돌린다.
			x = (b*10)+(sum % 10);
			cnt++; //반복문 실행 횟수 체크.
			if(x==N) { //만약 새로운 값이 N과 같다면, 반복문 탈출.
				break;
			}
		}
		System.out.print(cnt);
		
       
	}

}
