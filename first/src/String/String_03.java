package String;

import java.util.Scanner;

public class String_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		// �ƽ�Ű�ڵ� �� 97 = a
		//a~z���� 26
		int[] cnt = new int[26];
		for(int i =0; i<cnt.length; i++) {
			cnt[i] = s.indexOf(97+i);
			System.out.print(cnt[i]+" ");
		}
		scn.close();
	}

}
