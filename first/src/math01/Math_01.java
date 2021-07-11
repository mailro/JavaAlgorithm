package math01;

import java.util.Scanner;

public class Math_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
				Scanner in = new Scanner(System.in);
		 
		 
				int A = in.nextInt();	// 불변 비용
				int B = in.nextInt();	// 가변 비용
				int C = in.nextInt(); 	// 상품 가격
		        
				if (C <= B) {
					System.out.println("-1");
				} 
				else {
					System.out.println((A/(C-B))+1); //이윤
				}
			}
		}
		 
	


