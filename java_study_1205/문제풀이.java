package java_study_1205;

import java.util.Random;
import java.util.Scanner;

public class 문제풀이 {

	public static void main(String[] args) {

		//2
		String x = "10";
		int y;
		
		y = Integer.parseInt(x);
		
		System.out.println(y);
		
		//4
		
		/*
		for(int i=1;i<101;i++) {
			if(i%2==0) {
				System.out.println(i+"는 짝수입니다.");
			}else {
				System.out.println(i+"는 홀수입니다.");
			}
		
		
		//6
		for(int i=1;i<101;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		
		}
		*/
		
		//7
		int n = 15;
		
		int s ;
		
		s = n / 7;
		
		if(n%7 != 0) {
			s = s+1;
		}
		
		System.out.println(s+"판 필요합니다.");
		
		
		//8
		
		Scanner scan = new Scanner(System.in);
		/*
		int n8 = scan.nextInt();
		int s8 = 1;
		
		for(int i=1;i<=n8;i++) {
			s8 *= i; 
		}
		
		System.out.println(n8+"! = "+s8);
		*/
		
		//10
		
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
	}
		
		//11
		System.out.println("아이디를 입력하세요.");
		String x11 = scan.nextLine();
		
		
		if(x11.length()>10) {
			System.out.println("아이디는 10글자 이하로 작성해주세요");
		}else {
			System.out.println("입력한 아이디의 길이는 " + x11.length() + "글자입니다.");
		}
		
		//13
		
		Random random = new Random();
		
		int randomInt = random.nextInt(100);
		
		int array13[] = new int[10];
		
		  for(int i=0;i<array13.length;i++) {
	            array13[i] = random.nextInt(100); 
	            System.out.println("array13[" + i + "] = " + array13[i]);
	        }
		  
	    int max = array13[0];
	    
	    for(int i = 1; i<array13.length;i++) {
	       if (array13[i] > max) {
	                max = array13[i];
	            }
	        }
	    System.out.println(max);
	    
		}		
		
		
}
	



