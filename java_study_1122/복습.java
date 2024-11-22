package java_study_1122;

public class 복습 {

	public static void main(String[] args) {
		/*
		 길동이네 피자가게는 피자를 7조각으로 잘라준다.
		 피자를 나눠먹을 사람의 수 n이 주어질 때
		 모든 시람이 피자르 한조각 이상 먹기 위해서 
		 필요한 피자의 수를 구하세요.
		 */

		int n = 15;
		int slice = 7;
		int pizzaCount = 0;
		
		pizzaCount = n / slice; //나머지 값이 존재
		System.out.println("pizza count: "+pizzaCount);
		
		if(n % slice != 0) {
			++pizzaCount;
		}
		System.out.println("pizza count"+pizzaCount);
	
	/*
	 10만원 이상 사면 5%
	 30만원 이상이면 10%
	 50만원 이상이면 20%를 할인해줄때 가격을 입력했을 때
	 지불해야 할 금액을 출력하세요
	 */
	Scanner scan = new Scanner(System.in);
	System.out.println("금액을 입력하세요: ");
	int price = scan.nextInt();
	if(price >= 500000) {
		price *= 0.8;
	}else if(price >=300000)
	{
		price *= 0.9;
	}else if(price >= 100000)
	{
		price *= 0.95;
	}
	System.out.println("price: "+price);
	
	
	}

}
