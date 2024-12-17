package java_study_1217;

class Food{
	String name;
	int calories;
	
	public Food(String name, int calories) {
		this.name = name;
		this.calories = calories;
	}
	
	public void eat() {
		System.out.println("Eating: "+this.name);
	}
	
	public int getCalories() {
		return this.calories;
	}
}

class Pizza extends Food{
	String toppings[];
	//토핑 문자열 배열
	
	public Pizza(String name, int calories, String toppings[]) {
		super(name,calories); //부모클래스 생성자 호출
		this.toppings = toppings;
	}
	@Override
	public void eat() {
		System.out.println("Eating a slice of "+super.name+"pizza");
	}
	public void showToppings() {
		for(String s:toppings) {
			
			System.out.println("Toppings: ");
			
			for(String s:toppings) {
			System.out.println(s+",");
			}
			System.out.println("");
		}
	}
}
	
class Sushi extends Food{
	String fishType;
	
	public Sushi(String name, int calories,String fishtype) {
		super(name,calories);
		this.fishType = fishtype; // 필드 변수 대입
	}
	
	@Override
	public void eat() {
		System.out.println("Eating: "+super.name+"sushi");
	}
	
	public void showFishType() {
		System.out.println("FishType: "+this.fishType);
	}
}

public class 수업2 {

	public static void main(String[] args) {

		Food food = new Food("Food",100);
		//부모 클래스
		
		String topping[] = {"Tomato","Mozzarella","Basil"};
		Pizza margherita = new Pizza("margherita",300,topping);
		
		Sushi salmonRoll = new Sushi("salmon Roll",250,"Salmon");
		
		food.eat(); //푸드 클래스 eat 호출
		margherita.eat();
		//피자 클래스 eat(재정의한 메소드) 호출
		salmonRoll.eat();
		//스시 클래스 eat(재정의한 메소드) 호출
		
		margherita.showToppings();
		salmonRoll.showFishType();
		
		/*
		 Food 클래스: 기본 음식 클래스, 모든 음식의 공통 속ㅅ멍인
		 name과 calories 그리고 eat() 메소드를 가진다.
		 Pizza와 Sushi 클래스에는 토핑을 보여주는 
		 showToppings() 메소드 구현
		 
		 Sushi 클래스에는 생선종류를 보여주는 
		 showFishType() 메소드 구현
		 
		 핵심: Pizza와 Sushi 클래스의 속성과 메소드를
		 상속받아 재사용할 수 있습니다.
		 */

	}

}
