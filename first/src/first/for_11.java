package first;

import java.util.Scanner;

public class for_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int X = scn.nextInt();
		
		for(int i = 1; i<= N; i++) {
			int A = scn.nextInt();
			if(A<X) {
		    System.out.print(A + " ");
			}
		}
		
	}

}
