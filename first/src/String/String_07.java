package String;

import java.util.Scanner;

public class String_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String a = scn.next();
		String b = scn.next();
		
		int c = ((Integer.parseInt(a)%10)*100)+(((Integer.parseInt(a)/10)%10)*10)+(Integer.parseInt(a)/100);
		int d = ((Integer.parseInt(b)%10)*100)+(((Integer.parseInt(b)/10)%10)*10)+(Integer.parseInt(b)/100);
				
		if(c > d) {
			System.out.print(c);
		}else {
			System.out.print(d);
		}

				


		
	}

}
