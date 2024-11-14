package java_study_1114;

import java.util.Scanner;

public class javaExam {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 1. 사용자로부터 두 개의 정수를 입력받아 그 합을 출력
        System.out.println("첫 번째 정수를 입력하세요:");
        int a = scan.nextInt(); // 첫 번째 정수 입력
        System.out.println("두 번째 정수를 입력하세요:");
        int b = scan.nextInt(); // 두 번째 정수 입력
        int c = a + b;
        System.out.println("합은 " + c + "입니다.");

        // 2. 문자형 변수 x를 선언하고 '10'을 할당 후 
        // 정수형 변수 y를 선언하고 x의 값을 y에 할당하세요 (Integer.parseInt)
        System.out.println("\n문자 '10'을 정수로 변환합니다.");
        String x = "10"; // 문자형 변수에 문자열 '10' 할당
        int y = Integer.parseInt(x); // 문자열을 정수로 변환
        System.out.println("문자열 '10'을 정수로 변환한 값: " + y);

        // 3. 3개의 정수를 입력받아 평균을 출력하시오
        System.out.println("\n세 개의 정수를 입력하세요:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        double average = (num1 + num2 + num3) / 3.0; // 평균 계산 (정수를 3.0으로 나눠서 실수형으로)
        System.out.println("평균은 " + average + "입니다.");

        // 4. 정수를 입력받고 해당 정수의 10%는 몇인지 출력하시오
        System.out.println("\n정수를 입력하세요:");
        int num4 = scan.nextInt();
        double tenPercent = num4 * 0.1; // 10% 계산
        System.out.println(num4 + "의 10%는 " + tenPercent + "입니다.");

        scan.close(); // Scanner 닫기 (자원 누수 방지)
    }
}
