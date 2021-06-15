package first;

import java.util.Scanner;

public class for_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		
		for(int i =1; i<=a; i++) {
			for(int j = 1; j<= a-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k<= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		
	}

}
