package first;

import java.util.Scanner;

public class while_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
       int B = 0;
       int C = 0;
       int sum = 0;
       int result = 0;
       int copy = A;
       while(true){
           if(A == 0){
               result = A+1;
               System.out.print(result);
               break;
           }
           else if(0 < A && A < 10){
               result = (A*10)+A;
               System.out.print(result);
               break;
           }else if(9< A && A<100){
           //앞자리
           B = A%10;
           //뒷자리
           C = A/10;
           sum = B+C;
           result = sum+(C*10);
           System.out.print(result);
           break;
           } else {
        	   break;
           }
       }
       
	}

}
