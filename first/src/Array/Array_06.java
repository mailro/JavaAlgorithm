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
				if(ay[i].charAt(j) =='O') { //���ڿ� ��ӵ���
					cnt++; //0�϶� cnt���� 1�� ����.
				} else {
					cnt = 0;//X�� ������ cnt 0���� �ʱ�ȭ
				}
				sum += cnt; //���� ���հ�
			}
			System.out.println(sum);
		}
	}
}

		
