package Array;

import java.util.Scanner;

public class Array_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int ay[] = new int[10];
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int mt = a*b*c;
		//System.out.println(mt);
		
		while(mt!=0) {  
			ay[mt%10]++; 
			mt/=10; 
		}
		
		for(int i=0; i<ay.length; i++){
			System.out.println(ay[i]);
		}
	}
	

}
