 package java_study_1122;

public class 수업 {

	public static void main(String[] args) {

//		for(int i=1; i<=20; i++) { // 지역변수
//			System.out.println("안녕하세요");
//		}
		
		for(int i=0; i<9; i++) { // 지역변수
			System.out.println("i:"+i);
		}
		/*
		 for문 실행순서 초기식 -> 조건식 -> 코드실행
		 ->증감식
		 조건식이 만족할 때까지 반복
		 */
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 10까지의 총합은"+sum);
		
		for(int i=1; i<=20; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		for(int i=1; i<=30; i++) {
			if(i % 5 == 0) {
				System.out.println(i);
			}
		}
		
		for(int i=1; i<=5; i++) {
			if(i == 2) {
				System.out.println(i);
				break;
			}
			System.out.println(i);
		}
		
		int 구구단 = 2;
		
		for(int i=1; i<=9; i++) {
			System.out.println(구구단+"*"+i+구구단*i);
		}
		
		//while문은 조건이 참인 동안 코드 블록을 반복적으로 실행하는 반복문
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		//커피 자판기 예제
		int coffee = 10;
		while(coffee>0) {
			System.out.println("커피를 판매합니다. 남은 커피: "+coffee);
			coffee--;
			if(coffee == 0) {
				System.out.println("커피가 다 팔렸습니다.");
				break;
			}	
		}
	}

}
