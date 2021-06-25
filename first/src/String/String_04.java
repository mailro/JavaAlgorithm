package String;

import java.util.Scanner;

public class String_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int cnt = scn.nextInt();
		
		for(int i = 0; i<cnt; i++) {
			int strNum = scn.nextInt();
			String str = scn.next();
			
			for(int j = 0; j<str.length(); j++) {
				for(int k = 0; k<strNum; k++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
	}

}
