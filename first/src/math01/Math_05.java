package math01;

import java.util.Scanner;

public class Math_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		String[] result = new String[T];
		for(int i = 0; i < T; i++) {
			int H = input.nextInt();	// ³ôÀÌ
			int W = input.nextInt();	// °¡·Î
			int N = input.nextInt();	// N¹øÂ° ¼Õ´Ô 
			

			int height = N % H;   // Ãþ
			int width;            // È£
			
			result[i] = "";
			if(height == 0) {
				result[i] += H;
				width = N / H;
			}else {
				result[i] += height;
				width = N / H + 1;
			}
			
			if(width < 10) {
				result[i] += "0";
			}
			result[i] += width;
		} //¼Õ´Ô °è»ê d
		
		for(int i = 0; i < T; i++) {
			System.out.println(result[i]);
		}
		
		input.close();
	}
}
