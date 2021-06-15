package first;

import java.util.Scanner;

public class for_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0;
		for(int i = 0; i<=n; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
	}

}
