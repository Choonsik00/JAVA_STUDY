package java_study_1121;

import java.util.Scanner;

public class 수업 {

	public static void main(String[] args) {
		
		//시험 점수가 80이상이면 합격 아니면 불합격
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("점수를 입력하세요: ");
		
		int score = scan.nextInt();
		
		System.out.println("입력한 점수는"+score);
		
		if(score>=80) {
			System.out.println("시험에 합격했습니다!");
		}else {
			System.out.println("시험 불합격");
		}
		*/
		
		
		int score2 = scan.nextInt();
		
		System.out.println("입력한 점수는"+score2);
		
		if(score2>=90 && score2 <= 100) {
			System.out.println("A등급");
		}else if(score2>=80 && score2 < 90) {
			System.out.println("B등급");
		}else if(score2>=70 && score2 < 80) {
			System.out.println("c등급");
		}else { System.out.println("f등급");
		}
	}

}
