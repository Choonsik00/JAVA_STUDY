package java_study_1219;

interface CC{
	   //인터페이스는 클래스와 다르게 생성자가 없음
	   /*
	    * 인터페이스 
	    * 1. 메소드 선언만 가능 (구현 x)
	    * 2. 접근지정자는 'public'만 가능합니다.
	    */
	   /*public CC() {
	      
	   }*/
	   public void z(); //메소드 z 선언
	}

	class AA{
	   public void 메시지보여주다() {
	      System.out.println("안녕하세요.");
	   }
	}
	/*
	 * 자바는 다중 상속이 불가능합니다.
	 * 그래서 다중 상속이 가능하다록 '특별한' 기능이 존재
	 * implements를 실무에서 100% 사용합니다.
	 */
	class BB extends AA implements CC{
	   
	   @Override
	   public void z() { //강제로 재정의 해야함.
	      
	   } 
	   //BB클래스는 AA클래스를 상속받았습니다.
	   //BB클래스에서 AA클래스에 정의된 메소드를 사용 혹은 재사용할 수 있음.
	   //implements : 구현하다
	   //'클래스 BB는 인터페이스 CC를 구현하다' 라는 뜻이다.
	   /*
	    * 인터페이스를 상속받으면(구현하면) 인터페이스 CC에 있는 메소드를 
	    * 반드시 '재정의' 해야합니다.
	    * 즉, 인터페이스를 구현한 클래스는 '강제'로 구현해야합니다.
	    */
	   
	   /*
	    * 정리(팩트체크),
	    * 자바는 다중상속을 지원하지 않는다.
	    * 인터페이스라는 방법으로 다중상속을 구현한다.
	    * 인터페이스에 정의된 메소드를 강제로 재정의 해야한다.
	    * 클래스로 상속받으면 재정의를 자유롭게 정할 수 있다.
	    * 
	    * 상속 이점
	    * 1. 코드 재사용
	    * 2. 다형성 구현
	    * 3. 계층 구조 형성
	    */
	   
	}


public class 수업 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
