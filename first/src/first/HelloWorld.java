package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int val = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
		int[] arr = new int[10];
		
		while(val!=0) {  
			arr[val%10]++; 
			val/=10; 
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}


	}

}
