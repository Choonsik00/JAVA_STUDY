package java_study_1212;

class Person{
	String name;
	int age;
	
	Person(String name,int age){ //기본생성자 (default 생성자)
		/*
		 생성자: 클래스가 생성될 때 new를 불러올 때 
		 초기화를 위해 실행되는 특별한 메소드
		 
		 생성자 특징
		 1.생성자 이름과 클래스 이름은 동일해야함
		 2.생성자는 리턴타입이 없는 메소드이다.
		 3.생성자는 파라미터 타입만 있고 기본 생성자는 아무것도 받지 않는다
		 
		 생성자 파라미터의 역할은 받은 값을 필드 변수에 대입
		 */
		this.name = name; //this.name은 필드변수 "name"을 가르킨다
		this.age = age;
		//this.x = 10; 필드변수에 x라는 변수가 없으므로 에러
	}
	//void - return 타입이 없는 메소드
	public void celebrateBirthday(String name) {
		age++;
	}
}
public class 수업2 {

	public static void main(String[] args) {

		Person p = new Person("김철수", 20);
		//person 클래스 호출
		p.name = "김철수";
		p.age = 20;
		System.out.println(p.name);
		System.out.println(p.age);
		
		p.celebrateBirthday("김철수");//메소드 호출
		System.out.println(p.age);
		//파라미터에 값이 있다면 메소드를 호출할 때 값을 무조건 넣어야함
		
		Person p2 = new Person("홍길동",30);
		p2.name = "홍길동";
		p2.age = 30;
		System.out.println(p2.name);
		System.out.println(p2.age);
		
		
	}

}
