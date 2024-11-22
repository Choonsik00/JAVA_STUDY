package java_study_1121;

import java.util.Scanner;

public class 조건문문제풀이 {

	public static void main(String[] args) {
		// 3의 배수 판단
		
		int x = 15;
		
		//if와 else안에 코드가 한줄이면 중괄호 생략가능
		if(x%3==0) System.out.println("3의 배수입니다.");
		else System.out.println("아닙니다.");
		
		int y = 5;
		if(y % 5 == 0) {
			System.out.println("5의 배수입니다.");
		}else {
			System.out.println("아닙니다.");
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("a의 값을 입력하세요: ");
		int a = scan.nextInt();
		
		System.out.println("a의 값을 입력하세요: ");
		int b = scan.nextInt();
		
		if(a>b) {
			System.out.println("a값이 더 크다.");
		}else if(a<b){
			System.out.println("b값이 더 크다.");
		}else {
			System.out.println("값이 같다.");
		}
		
		int 짝수 = 4;
		if(짝수%2 ==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		int 홀수 = 9;
		if(홀수%2 != 0) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
		
		//3과 5의 공배수 판단
		int number = 15;
		if(number % 3 ==0 && number % 5 == 0)
		{
			System.out.println(number+"는 공배수입니다.");
		}
	}

}
