package java_study_1126;

import java.util.Random;

public class 배열2 {

	public static void main(String[] args) {

		//자바에서 배열을 만드는 경우는 2가지
		//1번째
		int []array = {2,3};
		//2번째
		int []array2 = new int[2];
		//길이만 생성 안에 값은 존재x
		System.out.println("배열 길이는: "+array.length);
		
		//값 넣기
		array2[0]=10;
		array2[1]=20;
		//array2[2]=20;
		
		System.out.println(array2[1]);
		
		//배열에 랜덤한 값 넣기
		
		int [] numbers = new int[10]; // 10길이의 배열 생성
		//1부터 100까지 중에서 랜덤 값을 배열에 차례로 넣기
		
		//자바에서는 랜덤값을 Random이라는 클래스를 이용
		Random random = new Random();
		numbers[0] = random.nextInt(100)+1;
		//1부터 100까지의 랜덤값을 0번째 인덱스에 대입
		System.out.println("0번째 인덱스 값은: "+ numbers[0]);
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = random.nextInt(100)+1;
			System.out.println(i+"번째 인덱스 값은: "+ numbers[i]);
		}
	}

}
