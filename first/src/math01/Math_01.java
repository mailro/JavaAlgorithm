package math01;

import java.util.Scanner;

public class Math_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
				Scanner in = new Scanner(System.in);
		 
		 
				int A = in.nextInt();	// �Һ� ���
				int B = in.nextInt();	// ���� ���
				int C = in.nextInt(); 	// ��ǰ ����
		        
				if (C <= B) {
					System.out.println("-1");
				} 
				else {
					System.out.println((A/(C-B))+1); //����
				}
			}
		}
		 
	


