package java_study_1212;

class 붕어빵{
	int 붕어빵가격;
	String 붕어빵종류; //팥,슈크림
	
	//기본생성자가 설정되어있어
	붕어빵(int 붕어빵가격,String 붕어빵종류){
		//필드변수 값을 초기화 할 수 있게하기
		this.붕어빵가격 = 붕어빵가격;
		this.붕어빵종류 = 붕어빵종류;
		
	}
	
	//메소드,리턴타입이 string 메소드명은 붕어빵내용추가
	public String 붕어빵내용추가(String 재료1,String 재료2) {
		String 최종재료 = 재료1 + 재료2;
		return 최종재료;
	}
}

public class 붕어빵기계 {

	public static void main(String[] args) {

		
		System.out.println("---춘식이네붕어빵---");
		붕어빵 춘식이네붕어빵 = new 붕어빵(1000,"팥");
		//붕어빵기계 클래스 호출
		System.out.println("붕어빵 종류:"+춘식이네붕어빵.붕어빵종류);
		System.out.println("붕어빵 가격:"+춘식이네붕어빵.붕어빵가격);
		
		
		String 최종재료 = 춘식이네붕어빵.붕어빵내용추가("치즈","고구마");
		//메소드 호출
		춘식이네붕어빵.붕어빵가격 = 3000;
		
		춘식이네붕어빵.붕어빵종류 = 춘식이네붕어빵.붕어빵종류 + 최종재료 + "붕어빵";
		//팥+치즈+고구마 붕어빵을 다시 "붕어빵종류" 필드변수에 대입
		System.out.println("붕어빵 종류:"+춘식이네붕어빵.붕어빵종류);
		System.out.println("붕어빵 가격:"+춘식이네붕어빵.붕어빵가격);
		
		/*1. 라이언붕어빵 기본: 슈크림, 가격:700
		  2. 라이언붕어빵 내용 추가: 옥수수,치즈 추가
		  3. 가격 1400원으로 올림
		  4. 최종 붕어빵 가격과 타입 출력
		*/
		
		System.out.println("---라이언붕어빵---");
		붕어빵 라이언붕어빵 = new 붕어빵(700,"슈크림");
		System.out.println("붕어빵 종류:"+라이언붕어빵.붕어빵종류);
		System.out.println("붕어빵 가격:"+라이언붕어빵.붕어빵가격);
		
		String 최종재료R = 라이언붕어빵.붕어빵내용추가("옥수수", "치즈");
		라이언붕어빵.붕어빵종류 = 라이언붕어빵.붕어빵종류+ 최종재료R + "붕어빵";
		라이언붕어빵.붕어빵가격 = 1400;
		
		System.out.println("붕어빵 종류:"+라이언붕어빵.붕어빵종류);
		System.out.println("붕어빵 가격:"+라이언붕어빵.붕어빵가격);
		
		
	}

}
