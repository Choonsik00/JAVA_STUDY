package java_study_1119;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		
		
		//문제 1번 정답:
		int 용돈 = 10000;
		용돈 -= 3000;
		용돈 += 5000;
		System.out.println(용돈);
		
		//문제 2번
		int 점수 = 80;
		점수 += 5;
		점수 *= 2;
		System.out.println(점수);
		
		
		//문제 3번
		int age = 20;
		boolean 면허증소지 = true;
		boolean 운전가능 = (age>=18) && 면허증소지;
		System.out.println(운전가능);
		
		
		//문제 4번
		boolean 면허증소지 = true;
		boolean 운전가능 = !면허증소지;
		System.out.println(운전가능);
		
		//문제 5번
		int a = 10;
		int b = 5;
		
		int s = a * b;
		System.out.println(s);
		
		//문제 6번
		boolean p = true;
		boolean q = false;
		boolean e = p && q;
		System.out.println(e);
		
		
		//문제 7번
		final double PI = 3.14;
		double radius = 5.0;
		double 넓이 = (radius * radius) * PI;
		System.out.println(넓이);
		
		//문제 8번
		double weight = 70.5;
		double height = 1.77;
		double bmi=0;
		
		bmi = weight / (height*height);
		
		System.out.println(bmi);
		
		
		//문제 9번
		int 대기번호 = 1;
		System.out.println("다음 번호"+대기번호++);
		System.out.println("다음 번호"+대기번호++);
		System.out.println("다음 번호"+대기번호);
		
		
		//문제 10번
		int age = 32;
		int year = 2024;
		int result = 0;
		
		result = year - age;
		
		System.out.println(result);

		
		//문제 11번
		Scanner scan = new Scanner(System.in);
		int obak = 500;
		int bak = 100;
		int change = 0;
		int change2 = 0;
		
		System.out.println("거스름돈을 입력하세요: ");
		
		int myMoney = scan.nextInt();
		
		change = myMoney/obak;
		
		System.out.println("오백원: "+change+"개");
		
		change2 = (myMoney-(change*obak))/bak;
		
		System.out.println("백원: "+change2+"개");
	}

}
