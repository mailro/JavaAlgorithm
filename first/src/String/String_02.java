package String;

import java.util.Scanner;

public class String_02 {
	//���� 11720�� ����. (������ ��)
	//���ڿ� ���� 2��° ����.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] ay = scn.next().split("");
		int sum = 0;
		int[] y = new int[n];
		
			for(int i = 0; i < n; i++) {
				
				y[i] = Integer.parseInt(ay[i]);
				
				sum += y[i];
				
			}
	
		System.out.println(sum);
		
	}

}
