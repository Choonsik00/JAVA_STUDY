package java_study_1205;

import java.util.Scanner;

public class 정답 {

	public static void main(String[] args) {

		//7번 
		int n = 15; 
		//7조각을 주는 이상한 피자가게 
		//상수 변수명은 대문자로 
		final int SLICE = 7; 
		//한판에 7조각 
		int x = n % SLICE; 
		int result = n / SLICE; if(x > 0) {
			//못먹은 사람이 있다면? 
			++result; //증감 연산자로 한판 더 
			} 
		//8번 팩토리얼 
		System.out.print("정수 입력받기 : "); 
		Scanner scan = new Scanner(System.in);
		int num = 5; 
		int factorial = 1; 
		for(int i=2; i<=num; i++) {
			factorial = factorial * i; } 
		System.out.println(num+"! ="+factorial);
		
		//10번 다음과 같은 패턴을 출력하는 프로그램을 작성하세요. 
		/* **** *** ** * */ 
		for(int i=4; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*"); 
				} 
			System.out.println();
			//개행 용 
} 
			//11번 힌트는 .length() 이용해서 if/else 처리하기 
		String word = "hh"; 
		System.out.println("문자 길이 : " + word.length()); 
		//17번 [배열] 
		int[] array = {149, 180, 192, 170}; 
		int height = 167; int count = 0; 
		
		//for-each 이용해서 풀어보기 
		for(int i : array) { if(height < i) {
			//if로 키큰사람 체크하기 
			++count; //증감연산자 이용 
			} 
		} System.out.println("정답 : " + count); 
		
		//18번 
		
		String cipher = "dfjardstddetckdaccccdegk"; 
		int code = 4; 
		String answer = "";
		
		//최종 결과 
		for(int i=0; i<cipher.length(); i++) {
			//문자길이만큼 반복문 돌리기 
			if((i+1) % code == 0) { 
				//code의 배수라면? 
				answer += cipher.substring(i, i+1); 
				//substring으로 한글자만 가져옴 
				} 
			} System.out.println("해독한 단어는 : " + answer + "입니다."); 
			
			//19번 -전화번호 /* * 전화번호 문자열 phone_number로 주어졌을 때,
			//전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을
			//출력하는 프로그램을 완성해주세요. 
			
			//첫번째방법 substring 
			String phone_number = "0171238888"; 
			int temp = phone_number.length() - 4; 
			
			//4자리를 제외한 
			String star = ""; 
			for(int i=0; i<temp; i++) {
				star += "*"; 
				} 
			String lastNumber = phone_number.substring(temp); 
			//6번째 자리부터 모두 나오게 하기 
			System.out.println("lastNumber : "+lastNumber);
			phone_number = star + lastNumber;
			System.out.println("phone_number : " + phone_number); 
			//2번째 방법 split 
			String[] phone = phone_number.split(""); 
			// split으로 한글자 한글자 배열에 담기 
			String result2 = "";
			//결과 
			for(int i=0; i<phone.length; i++) {
				//배열 길이만큼 반복 
				if(i < (phone_number.length() - 4)) {
					result2 += "*"; }else{ result2 += phone[i]; 
					} 
				} 
			System.out.println("result2 : "+result2); 
			String str = "Hello"; 
			String str2 = "World"; 
			System.out.println(str + str2); 
			
			//HelloWorld 
			String a = ""; 
			for(int i=0; i<3; i++) {
				a += "!"; 
		} 
			System.out.println(a); 
			// "=" : 대입연산자 (덮어씌우기, 기존 값을 무시하고 새로운 값을 대입함) 
			
			//20번 [치킨] while + 사칙연산 
			/* * ○○치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다 
			 * * 쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 
			 * * (서비스 치킨에도 쿠폰이 발급됩니다.) * 시켜먹은 치킨의 수 
			 * chicken이 변수로 주어질 때 받을 수 있는 최대 서비스 치킨의 수를 출력하세요. */
			
			int chicken = 100; //100마리 주문 
			int chickenCount = 0; 
			//총 내가 먹을 수 있는 치킨 수 
			//1. 반복을 하면서 쿠폰이 있는지? 
			//없는지를 계속 체크해야합니다. 
			
			//2. 10번 반복할지 5번 반복할지 모름 -> while
				while(chicken >= 10) {
				//3. 조건식 생각하기 
				int coupon = chicken % 10; 
				//4. 나머지값을 쿠폰에 대입 
				System.out.println(coupon); 
				chickenCount += chicken / 10; 
				chicken = coupon + chicken / 10; 
		} System.out.println("최대 서비스 치킨 수 : " + chickenCount); 
		
		//[문제21 - 난이도 Up] [contains 활용하기] 
		String my_string = "people"; 
		//p와 e가 중복됨 
		String[] strArray = my_string.split("");
		String result3 = ""; 
		
		//최종 결과 변수 
		for(int i=0; i<strArray.length; i++) {
			if(!result3.contains(strArray[i])) { result3 += strArray[i]; 
			} 
			}
		System.out.println("정답 : " + result3); 
		//[문제22 - 난이도 Up] 개미 군단 
		//-> 그리드(탐욕) 알고리즘 
		int hp = 24; //여치 HP 
		int count2 = 0; count2 += hp / 5; 
		//장군개미 
		hp %= 5; count2 += hp / 3; 
		//병정개미 
		hp %= 3; count2 += hp; 
		
		System.out.println(count2);
		}
		

	}


