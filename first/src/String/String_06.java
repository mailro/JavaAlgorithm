package String;

import java.util.Scanner;

public class String_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		int cnt = 0;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') {
				cnt++;
			}
		}
		cnt++;
		if(str.charAt(0) == ' ') {
		 cnt--;
		}
		if(str.charAt(str.length()-1)==' ') {
			cnt--;
		}
		System.out.print(cnt);
	}

}
