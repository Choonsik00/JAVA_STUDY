package java_study_1217;

import java.util.Scanner;

/*
 계산기 클래스는 더 이상 수정 불가
 Scanner 클래스 -> 내장 클래스(자박를 설치했을 때 이미 자바에 존재)
 Random 클래스 -> 
 */
class 계산기{
	
	//파라미터값을 각각 더해 리턴하는 함수
	public int sum(int x,int y) {
		return x+y;
	}
	
	public int minus(int x,int y) {
		if(y>x) {
		return y-x;
		}else {
			return x-y;
		}
	}
}

/*
 extends: 상속
 상속을 이용해 계산기 클래스 기능을 물려받을 수 있음
 계산기3은(자식클래스 = subClass) 
 계산기(부모클래스 = superClass)에 있는 
 필드변수와 메소드를 사용가능
 */
class 계산기3 extends 계산기{
	
}

public class 수업 {

	public static void main(String[] args) {

		계산기 계산기1 = new 계산기();
		int result = 계산기1.sum(10, 20);
		System.out.println("결과:"+result);
		
		int result2 = 계산기1.minus(10, 30);
		System.out.println("결과:"+result2);
		
		Scanner scan = new Scanner(System.in);
		//ctrl+shift+o(자동 임포트)
		/*
		 자바는 무료 오픈소스이기 때문에 내장클래스를 
		 확인할 수 있음
		 */
		
		계산기 계산기3 = new 계산기3();
		int result3 = 계산기3.sum(10, 20);
		//자식클래스가 부모클래스에 있는 메소드 사용
		System.out.println(result3);
	}

}
