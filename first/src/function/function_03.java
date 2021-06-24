package function;

import java.util.Scanner;

public class function_03 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println(hasu(scn.nextInt()));
		
			
		
	}
	
	public static int hasu(int sc) {
		
		int cnt = 0;
		
		if(sc<100) {
			return sc;
		}else if(sc == 1000) {
			return hasu(999);
		}
		else {
		
		for(int i = 100; i<=sc; i++) {
			int one = i%10; //1의 자리
			int two = (i % 100) / 10; //10의 자리
			int three = i / 100; //100의 자리
			int hansuone = two-one;
			int hansutwo = three - two;
			
			if(hansuone == hansutwo) {
				cnt++;
			}
		}
		return cnt+99;
		}
	}
	
}
