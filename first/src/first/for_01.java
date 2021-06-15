package first;

import java.util.Scanner;

public class for_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int avg = 0;
        for(int i=1; i<=9; i++){
            avg = N*i;
            System.out.println(N+" * "+i+" = "+avg);
	}

}
}
