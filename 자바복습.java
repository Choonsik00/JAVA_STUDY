package java_study;

import java.util.Scanner;

public class 자바복습 {

	public static void main(String[] args) {
	
			String name = "Kim";
			int age = 25;
			String address = "대전 서구 둔산동";
			String mbti = "istj";
			String hobby = "게임";
			
			System.out.println("이름:"+ name);
			System.out.println("나이:"+ age);
			System.out.println("주소:"+ address);
			System.out.println("취미:"+ hobby);
			System.out.println("MBTI:"+ mbti);
		
			//입력
			Scanner scan = new Scanner(System.in);
			//입력한 후 ctrl + Shift + o를 눌러주세요.
			
			System.out.print("이름을 입력해주세요 =>");
			String n = scan.next();
			System.out.println("입력하신 이름은 :"+ n + "입니다.");
			
			System.out.print("MBTI를 입력해주세요 => ");
			String m = scan.next();
			System.out.println("MBTI는" + m +"입니다.");
			
			System.out.print("나이를 입력해주세요 => ");
			int a = scan.nextInt();
			System.out.println("나이는" + a +"입니다.");
			
			System.out.print("취미를 입력해주세요 => ");
			String l = scan.next();
			System.out.println("취미는" + l +"입니다.");
			
			System.out.print("키를 입력해주세요 => ");
			int h = scan.nextInt();
			System.out.println("키는" + h +"입니다.");
			
	}


	}

