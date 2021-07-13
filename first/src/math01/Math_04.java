package math01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math_04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double a = Integer.parseInt(st.nextToken()),
		b = Integer.parseInt(st.nextToken()), 
		v = Integer.parseInt(st.nextToken());
		System.out.println((int)Math.ceil((v-a)/(a-b)) + 1);



	}

}
