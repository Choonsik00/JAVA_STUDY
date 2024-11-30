package java_study_1128;

import java.util.Scanner;

public class 문자열문제 {

	public static void main(String[] args) {

		String email[] = {"123@naver.com","456@gmail.com","789@naver.com"};
		//네이버 이메일을 사용하는 계정만 출력
		
		for(int i=0;i<email.length;i++) {
			String e = email[i];
			System.out.println("이메일 주소: "+e);
			if(e.contains("naver.com")) {
				System.out.println("네이버 이메일: "+e);
			}
		}
		//split을 활용하여 특정 문자 개수 구하기
		String food = "돈까스@돈까스@라면@김밥@돈까스";
		String foodArray[] = food.split("@");
		int count = 0;
		for(int i = 0; i<foodArray.length;i++) {
			if(foodArray[i].equals("돈까스")) {
				++count;
			}
		}
		System.out.println("돈까스 갯수는: "+count);
		
		//4번
		String text = "Hello World!";
		System.out.println(text.toUpperCase());
		
		
		//5
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 것을 입력하세요:");
		String chara = scan.next();
		System.out.println("두번째 것을 입력하세요:");
		String chara2 = scan.next();
		
		if(chara.equals(chara2)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		//6
		String chara3 = scan.next();
		
		System.out.println(chara3.substring(0,1));
		
		System.out.println(chara3.substring(4));
		
		//7
		System.out.println("문자열을 입력하세요.");
		String cc = scan.next();
		
		System.out.println("몇번째까지 출력할까요? ");
		int sc = scan.nextInt();
		
		System.out.println(cc.substring(0,sc));
		
		
		//8
		String word = "aabbacccaaaaa";
		char targetChar = 'a'; // 찾고자 하는 문자
		int count1 = 0;

		 // 문자열을 한 문자씩 순회하며 'a'의 개수를 셉니다.
		 for (int i = 0; i < word.length(); i++) {
		      if (word.charAt(i) == targetChar) {
		                count1++;
		      }
		 	}

		 // 결과 출력
		 System.out.println("문자 '" + targetChar + "'는 " + count1 + "번 나타납니다.");
		    }
		
		//9
		String email = "user@gmail.com";
		String result[] = email.split("@");
		
		System.out.println(result[1]);
		
	

}
