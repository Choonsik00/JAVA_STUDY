package java_study_1205;

public class 복습 {

	public static void main(String[] args) {

		//사칙연산 - 거스름돈
		
		int money = 74900;
		// 결과 오만원 1장, 만원 2장,천원 4장,5백원 1
		// 1백원 4개
		
		int 오만 = money/50000;
		money = money % 50000;
		
		int 만원 = money / 10000;
		money = money % 10000;
		
		int 천원 = money / 1000;
		money = money % 1000;
		
		int 오백 = money / 500;
		money = money % 500;
		
		int 백 = money / 100;
		
		
		
		System.out.println("오만원 "+ 오만 + "장");
		System.out.println("만원 "+ 만원 + "장");
		System.out.println("천원 "+ 천원 + "장");
		System.out.println("오백원 "+ 오백 + "개");
		System.out.println("백원 "+ 백 + "개");

		/*
		 그리드(탐욕) 알고리즘
		 선택의 순간마다 당장 눈앞에 보이는 최적의 상황만을
		 쫒아 최종 답에 도달하는 방법.
		 */
		
		//상수: 변경 불가
		//프로그래밍에서 상수표현은 데이터타입 앞에 final 키워드를 사용
		//상수를 표현할 땐 변수이름을 대문자로 적어야한다. (개발자 약속)
		final double PI = 3.14;
		
		/*
		 원의 반지름이 주어졌을때 원의 면적을 계산하세요
		 원의 면적은 반지름의 제곱입니다.
		 */
		
		double radius = 5.0;
		System.out.println(PI*radius*radius);
		
		/*
		 직각삼각형의 한 변의 길이를 나타내는 정수 a와 빗변의
		 길이를 나타내는 정수 c가 변수로 주어질 때 한변의 길이의 제곱과 b를 출력
		 */
		
		double a = 3;
		double b;
		double c = 5;
		double bb = 0;
		b = (c*c) - (a*a);
		
		System.out.println(b);
		
		int array[] = {1,3,5};
		System.out.println(array[0]);
		//마지막 인덱스 출력
		System.out.println(array[2]);
		System.out.println(array.length-1);
		
		//1번 인덱스값과 2번 인덱스값 서로 교환하기
		int temp = array[1];
		array[1] = array[2];
		array[2] = temp;
		//이 과정을 swap
		
		//배열 문제가 나오면 무조건 for문
		for(int i : array) {//foreach문(배열 길이만큼 자동으로 반복)
			System.out.println("i: "+i);
		}
		
		String i = "10";
		int j = Integer.parseInt(i);
		
		
		 
	}

}
