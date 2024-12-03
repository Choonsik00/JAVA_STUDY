package java_study_1203;

public class 복습 {

	public static void main(String[] args) {

		//1. 1부터 100까지의 숫자 중 짝수만 출력
		
		for(int i=1;i<101;i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}

		}
		
		//2 1부터 10까지의 합구하기
		int sum = 0;
		for(int i=1;i<11;i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//3 배열
		String array[] = {"apple","apple","apple","banana"};
		int count = 0;
		
		for(String i : array) {
			if(i.equals("apple")) {
				++count;
			}
		}
		System.out.println(count);
		
		/* 4
		 10만원이상 5% 30만원이상 10% 50만원이상 20%
		 price변수에 580,000 주어질때 지불해야 할 금액?
		 */
		double price = 580000;
		
		if(price>=500000) {
			price = price * 0.8;
		}else if(100000>=price) {
			price = price * 0.9;
		}else if(price >= 100000) {
			price = price * 0.95;
		}
		System.out.println(price);
		
		/* 5
		 문자열 my_string에 hello가 주어질 때
		 my_string에 들어있는 각 문자를 n만큼 반복한
		 문자열 출력하기
		 n에 3이 주어짐
		 */
		
		//ver.1
		String my_string = "hello";
		int n = 3;
		String mystr[] = {"h","e","l","l","o"};
		
		for(int i=0;i<my_string.length();i++) {
			for(int j=0;j<n;j++) {
				System.out.println(mystr[i]);
			}
		}
		
		//ver.2
		String result = "";
		for(int i=0;i<my_string.length();i++) {
			String word = my_string.substring(i,i+1);
			for(int j=0;j<n;j++) {
				result += word;
			}
		}
		System.out.println(result);
		
		//repeat: 특정 문자를 반복
		String s = "Hello";
		System.out.println(s.repeat(3));
		
		//repeat 활용해서 위 문제 다시 풀어보기
		String strArray[] = my_string.split("");
		String result2 = "";
		for(String i: strArray) {
			result2 += i.repeat(n);
		}
		System.out.println(result2);
	
	/*
	 배열 짝수,홀수 개수 구하기
	 정수형 배열 num_list가 주어질때 num_list의 원소 중
	 짝수와 홀수의 개수를 담은 정수형 배열 answer_list 완성하기
	 결과 [0,4] 즉, 0번째 인덱스엔 짝수 1번째 인덱스엔 홀수 개수가 옴
	 
	 */
		
		int num_list[] = {1,3,5,7};
		int answer_list[] = new int[2];
		int count1 = 0;
		int count2 = 0;
		
		for(int i: num_list) {
			if(i % 2 == 0) {
				count1++;
				answer_list[0]=count1;
			}else{
				count2++;
				answer_list[1]=count2;
			}
		}
		System.out.println();
		
		/*
		 10인분을 먹으면 음료수 1개
		 1인분에 12000원
		 음료수 2000원
		 양꼬치 n인분 음료수 k개
		 총 얼마를 지불해야 할까요?
		 */
		
		int 양꼬치 = 12000;
		int 음료수 = 2000;
		int n1 = 64;
		int k = 6;
		
		int ssum = 0;
		int ssum2 = 0;
		
		ssum = 양꼬치 * n1;
		
		k = k - (n1 / 10);
		
		ssum2 = 2000 * k;
		
		System.out.println(ssum+ssum2);
		
	}
}


