package first;

import java.util.Scanner;

public class for_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		
		for(int i = 0; i<T; i++ ) {
			int A = scn.nextInt();
			int B = scn.nextInt();
			System.out.println(A+B);
		}
	}

}
