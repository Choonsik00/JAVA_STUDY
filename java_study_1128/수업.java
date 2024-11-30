package java_study_1128;

public class 수업 {

	public static void main(String[] args) {

		String text = "ediya";
		System.out.println("문자열 길이"+text.length());
		
		String userId = "홍길동";
		if(userId.length() >= 10) {
			System.out.println("아이디는 10글자 미만으로 작성해주세요.");
			
		}else {
			System.out.println("사용가능한 아이디입니다.");
		}

		//concat: 두 문자열을 합친다. 
		String a = "apple";
		String b = "watch";
		System.out.println("문자열 합치기  "+a.concat(b));

		//substring: 부분 문자열 추출 (빈도수 80~90)
		String text1 = "Hello, World!";
		System.out.println(text1.substring(0,5));
		System.out.println(text1.substring(7,10)); //Wor출력
		
		//indexOf: 문자열 검색 - 해당 문자가 몇번째 위치하는지 조회
		System.out.println(text1.indexOf("l"));//l은 2번째
		System.out.println(text1.indexOf("W"));//w는 7번째
		
		//***replace: 문자열 대체 (자주사용)
		String word = "순대국밥";
		System.out.println(word.replaceAll("순대","돼지"));
		//순대를 돼지로 변경
		
		//*toUpper,toLower: 소문자 <-> 대문자 변경
		String code = "abcd00";
		System.out.println(code.toUpperCase());
		
		//**trim: 공백제거
		String word2 = "   안녕하세요?   ";
		System.out.println(word2.trim());
		
		//***split: 문자 분할 (실무에서 데이터분석 혹은 코딩테스트 단골 손님!)
		String word3 = "한화이글스,두산베이스,롯데자이언츠";
		String result[] = word3.split(",");//해당 문자를 콤마로 나눈다.
		System.out.println(result[0]);
		System.out.println(result[2]);
		
		//**contains: 특정 문자열이 포함되어 있는지 여부확인
		String word4 = "abcde@gmail.com";
		System.out.println(word4.contains("@"));
		//@있으면 true 없으면 false
		System.out.println(word4.contains("A"));
		
		//***equals: 문자열 비교(자바특징)
		String food = "등심돈까스";
		String food2 = "등심돈까스";
		String food3 = "치즈돈까스";
		//==(비교연산자), 자바에서는 문자열 비교는 equals로 한다.
		System.out.println(food.equals(food2));
		//두 문자가 동일한지 비교
		System.out.println(food.equals(food3));
		
		
	}

}
