package String;

import java.util.Scanner;

public class String_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = sc.next();

		int max=0;
		int cnt=0;
		int num=0;


		st = st.toUpperCase();
		int Alpha[] = new int[26];
		
		//abcd    1 = b   b-65 = 1        alpha[0]-> 1 b -> 1
		for(int i=0;i<st.length();i++) {
		Alpha[(st.charAt(i)-65)]++;
		}


		for(int i=0;i<Alpha.length;i++) {
		if(Alpha[i]>max) {
		max = Alpha[i];
		num = i;
		}}


		for(int i=0;i<Alpha.length;i++) {

		if(Alpha[i]==max) {
		cnt++;
		}}


		if(cnt>1) {
		System.out.println("?");
		}


		else
		System.out.println((char)(num+65));
		}}
	

