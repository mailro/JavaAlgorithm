package String;

import java.util.Scanner;

public class String_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt(); // ������ �ܾ��� ��
		int cnt=num; // �ܾ��� ���� �ʱⰪ���� �׷�ܾ �ƴ� �� -1�� �ϴ� �����̴�.


		for(int roop = 0;roop<num;roop++) {  // �Է¹��� ������ ����ŭ �ݺ��Ѵ�.
			String st = sc.next(); // ���ڿ� �Է�
			boolean test[] = new boolean[26]; // ���ĺ� �迭�� ���� �̹� üũ�� ���ĺ��� true�� �ٲ��ش�. (boolean �迭�� �ʱⰪ�� false)

			for(int i=0;i<st.length()-1;i++) { // i�� i+1�� ���ϴ� �����̹Ƿ� <st.length()-1 �� ���־���.
				if(st.charAt(i)!=st.charAt(i+1)) { // i�� i+1�� �ٸ���� (���� ���ĺ��� ���� ���ĺ��� ��)
					if(test[st.charAt(i+1)-97]==true) { // �̹� �ѹ� üũ�� ���ĺ��� ��� �׷�ܾ ���� ���ϴ� ��
						cnt--; // �׷�ܾ �ƴ϶�� �Ǵ� �� ��� �ʱⰪ�� �ܾ��� ������ 1�� ���ش�.  ��ü-�׷�ܾ �ƴҰ�� = �׷�ܾ��� ���
						break; // �׷�ܾ �ƴ϶�� �Ǵܵ� �� ��� break�� �������´�. �̰��� ���� �ٽ� ������� -1,-3 ���� ����� ���� �� �ִ�. ������ �ݺ��ؼ� -1 �Ǳ⋚��
					}
				}
				test[st.charAt(i)-97]=true; // ���� ó���� �� �������� �ش� ���ĺ��� trueó�� ���־� �������� �ݺ��Ǵ°�� ���ܵǵ��� ó���Ѵ�. -97�� �ƽ�Ű�ڵ�� a�� 97�̴� -97���־� a�� 0���� ��������
			}
		}
		System.out.println(cnt); // ���� cnt�� ����Ͽ� �׷�ܾ��� ���ڸ� ����Ѵ�
	}
}



