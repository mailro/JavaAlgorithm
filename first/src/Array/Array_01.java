package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();  //�迭�� ũ�� �Է�
		int a[] = new int[N]; //�迭 ����
	
		for(int i = 0; i<a.length; i++) {
			int num = scn.nextInt();//�迭�� �� �� �Է�
			a[i] = num; //�迭�� ���ֱ�
			
		}
		Arrays.sort(a);
		System.out.print(a[0] + " " + a[N-1]);

	}

}
