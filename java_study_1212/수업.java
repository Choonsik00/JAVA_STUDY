package java_study_1212;

class 학생 {
	String 이름; //필드변수(전역변수) 초기화 생략가능
	int 학년; 

	/*
	 * 클래스 구조(객체지향에 있는 공통 개념)
	 * 1. 필드변수
	 * 2. 메소드 : 메소드는 특정 작업을 수행하는 코드의 집합
	 * => 능력있는 개발자는 메소드를 여러개 만들어서 코드를 분리
	 * 3. 생성자
	 */


	/*
	 * 메소드의 기본 구조
	 * public: 접근제어자
	 * int: 반환 데이터타입(리턴값)
	 * add: 메소드 이름(보통 동사로 작성을 합니다.)
	 * (int a,int b): 인자값/매개변수/파라미터(v)
	 * 파라미터: 메소드가 작업을 수행하는 데 필요한 데이터
	 * return: 반환 데이터타입에 맞는 반환값(메소의 결과를 반환)
	 */
	public int add(int a,int b) {
		return a + b;
	}

	public int minus(int a,int b) {
	return a - b;
}

	public int multi(int a,int b) {
	return a * b;
}

	public int div(int a,int b) {
	return a / b;
}
	
	//반환 데이터타입 9가지가 가능합니다. + void 총 10개
	public String 취미를소개() {
		String 취미 = "등산";
		return 취미;
	}
	
	public void 취미를소개2() {
		System.out.println("1");
	}
}
	
//클래스 파일 하나에 public 한 번 사용가능
public class 수업 {

	public static void main(String[] args) {
		
		
		//java 메모리: Heap이라는 영역에 저장(인스턴스 변수)
		학생 s1 = new 학생();
		//new: 클래스를 불러오다 (클래스를 인스턴스화(객체화))
		s1.이름 = "홍길동";
		s1.학년 = 3;
		System.out.println("이름 : "+s1.이름+", 학년:"+s1.학년);
		System.out.println(s1);
		
		//동일한 클래스 한 번 더 호출
		학생 s2 = new 학생();
		System.out.println(s2);
		s2.이름 = "김길동";
		s2.학년 = 1;
		System.out.println("이름 : "+s2.이름+", 학년:"+s2.학년);
		
		학생 s3 = new 학생();
		System.out.println(s3);
		//새로운 heap 영역에 저장
		int result = s3.add(10, 20);
		System.out.println("결과: "+ result);
		
		int result2 = s3.minus(30, 10);
		System.out.println("결과: "+ result2);
		
		int result3 = s3.multi(10, 10);
		System.out.println("결과: "+ result3);
	}

}
