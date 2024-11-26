package java_study_1126;

import java.nio.file.spi.FileSystemProvider;

public class 배열 {

	public static void main(String[] args) {
		
		// 배열은 중요하다
		// 배열 > for문 > if문
		// 배열은 0부터 시작합니다.
		
		/*
		int [] array = {10,20,30,40};
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		
		int sum = array[1] + array[3];
		System.out.println(sum);
		
		
		int[] array2 = {10,20,30,40,10,20};
		
		for(int i=0; i<array2.length;i++) {
			System.out.println("배열 값: "+array2[i]);
		}
		System.out.println("배열의 길이는? "+array2.length);
		
		int[] array3 = {2,3,4,5,6};
		
		for(int i=0; i<array3.length; i++) {
			//int num = array3[i];
			if(array3[i] % 2 == 0) {
				System.out.println(array3[i]);
			}
		}
		
		
		int[] array3 = {2,3,4,5,6};
		int sum = 0;
		
		for(int i=0; i<array3.length;i++) {
			sum += array3[i];
		}
		System.out.println("총합: "+sum);
		System.out.println("평균: "+sum/array3.length);
		*/
		
		int[] array4 = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for(int i=0; i<array4\.length; i++) {
			//int num = array3[i];
			if(array4[i] % 3 == 0) {
				sum += array4[i];
			}
		}
		System.out.println(sum);
		
	}

}
