package String;

import java.util.Scanner;

public class String_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "�����,����, 10����, ������.";
		String[] b = A.split(",");
		for(String i:b) {
			System.out.println(i);
		}
		
		String C = "���� : ���� , 20������ �Ҿ���.";
		String[] D = C.split(" : | ,");
		for(String i : D) {
			System.out.println(i);
		}
		
		System.out.print(C.charAt(0));
		System.out.print(C.charAt(1));
}

}
