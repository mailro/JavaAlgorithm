package first;

import java.util.Scanner;

public class while_04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
       int cnt =0;
        int x = N;
		while (true) {
			// �� / 26�� �ԷµǸ�  a���� 2
			int a = x / 10;  // ù�ڸ���
			// ������ % 26�� �ԷµǸ� b���� 6
			int b = x % 10; // ���ڸ� ��
			int sum = a+b; // ó���� ���ϱⰪ�� ������. �� ���ο� ���� ���ڸ���.
			//2+6�� �ؼ� sum���� 8�� �ƴ�
			//���ο� ���� b�� 6�� 10�� ���ϰ� sum�����ϸ�  68�� �ǰ� �� ���� �Է°��� ����ؾ��Ѵ�.
			//�� ���ο� ���� �Է°��� �ٸ��� ���������� �ٽ� ������.
			x = (b*10)+(sum % 10);
			cnt++; //�ݺ��� ���� Ƚ�� üũ.
			if(x==N) { //���� ���ο� ���� N�� ���ٸ�, �ݺ��� Ż��.
				break;
			}
		}
		System.out.print(cnt);
		
       
	}

}
