package java_study_1128;

import java.util.Random;

public class 배열문제 {

	public static void main(String[] args) {
		
		/*
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		int array2[] = new int[10];
		
		for(int i=0;i<array2.length;i++) {
			array2[i] = i+1;
			System.out.println(array2[i]);
		}
		int result = array2[2] * array2[5];
		System.out.println("1번 정답: "+result);
		*/
		Random random = new Random();
		
		int array[] = new int[100];
		
		for(int i=0;i<array.length;i++) {
			array[i] = random.nextInt(100)+1;
			
		}
		//최댓값 구하기
		int max = 0;
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) { //max가 배열에 있는 값보다 작다면
				max = array[i];//최댓값 변수에 값 대입
				
			}
		}
		System.out.println("최댓값은?"+max);
	}

}
