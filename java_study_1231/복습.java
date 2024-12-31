package java_study_1231;

import java.util.Scanner;

class A { // A클래스 선언
	private int x; // 전역변수 선언
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}

public class 복습 {

	public static void main(String[] args) {
		// 플래그 깃발값 => true or false
		boolean isFlag = false;

		String inputWord = "사과"; // 입력받은 문자(가정)

		if (inputWord.equals("사과")) {
			// inputWord가 사과라면?
			isFlag = true;
		}
		if (isFlag) {
			System.out.println("플래그 값 변경");
		}

		// 예시
		boolean isFlag2 = false;
		String book[] = { "책1", "책2", "책3" }; // 배열선언
		Scanner scan = new Scanner(System.in);

		System.out.print("찾을 책을 입력하세요: ");
		String search = scan.next(); // 문자 입력받기

		for (String s : book) {
			if (s.equals(search)) { // 배열안에 있는 값과
				isFlag2 = true;
			}
		}

		if (!isFlag2) { // isFalg2가 falsed일 때 실행하는 if코드
			System.out.println("입력한 도서는 해당 도서관에 없습니다.");

		}

		A a = new A(); // A클래스 호출
		a.setX(10); // 전역변수를 x 10으로 초기화
		System.out.println(a.getX()); // 전역변수 x출력

		A array[] = new A[5]; // 객체 배열

		array[0] = a; // 0번째 인덱스에 a 대입

		array[0].getX(); // 0번째에 들어간 A클래스 get함수 사용가능

		A b = new A();
		b.setX(20);
		array[1] = b; // 1번째 인덱스에 b대입

		A c = new A();
		c.setX(30);
		array[2] = c;

		// array에 저장된 각각의 A클래스 x 전역변수 총합을 구하기
		int sum = 0;
		for (A i : array) {
			sum += i.getX();
		}

		System.out.println("총합: " + sum);

	}
}
