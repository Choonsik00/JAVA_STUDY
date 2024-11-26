package java_study_1126;

import java.util.Random;

public class 문제 {

	public static void main(String[] args) {
		
		/* 1번
		10개의 정수를 저장하는 배열을 선언하고 1~10의 값으로 초기화한 후
		2번째 인덱스와 5번째 인덱스를 곱한 값을 출력
		
		2번
		1번에 이어 배열의 저장된 값을 모두 더하세요
		
		3번
		크기 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로
		초기화 한 후, 배열의 요소들 중 짝수만 출력하세요
		
		4번
		3번에 이어 랜덤값 중 최댓값을 출력하세요
		*/
		
		int []array = {1,2,3,4,5,6,7,8,9,10};
		
		int number = array[1] * array[4];
		
		System.out.println(number); //1
		
		int sum = 0; 
		for(int i=0;i<array.length;i++) {
			sum += array[i];
		}
		System.out.println(sum); //2
		
		int numbers [] = new int[10];
		Random random = new Random();
		numbers[0] = random.nextInt(100)+1;
		
		for(int i=0;i<array.length;i++) {
			numbers[i] = random.nextInt(100)+1;
			if(numbers[i] % 2 == 0) {
				System.out.println(numbers[i]);
			}
		}//3
		
		//푸는중
		for(int i=0;i<array.length;i++) {
			numbers[i] = random.nextInt(100)+1;
			if(numbers[i] <= numbers[i+1]) {
				System.out.println(numbers[i+1]);
			}
		}
	}

}
