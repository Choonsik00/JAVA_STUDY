package java_study_1119;

public class 복습 {

	public static void main(String[] args) {
		
		int y = 20; //변수 이름은 중복 X
		int a = 20;
		a = 10; //a라는 변수를 10으로 초기화
		System.out.println("a의 최종 값은: "+a);
		
		int b = 20; //b라는 변수 생성
		b = 40;
		
		//문제 11
		int n1 = 100;
		int n2 = 90;
		int n3 = 70;
		int avg = 0; //평균을 구할 변수
		
		avg = (n1+n2+n3)/3; //평균을 구한 값을 avg에 대입
		System.out.println("평균: "+avg);
		
		//문제 12
		int money = 800;
		double percent = money * 0.1;
		System.out.println("800의 10%는 "+percent);
		
		

	}

}
