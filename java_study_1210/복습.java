package java_study_1210;

public class 복습 {

	public static void main(String[] args) {

		//연산자
		/*
		 가장 많이 사용하는 연산자
		 1. 대입연산자
		 2. 사칙연산자
		 */
		
		int x = 10;
		x = 30;
		System.out.println("x의 최종 값은?" +x);
		
		String s = "123";
		String s2 = "456";
		String result = s + s2; // 문자 합침
		System.out.println("결과: "+result);
		
		int num = Integer.parseInt(result);
		//문자가 숫자로 변환
		
		int count = 0;
		++count;
		count++;
		++count;
		System.out.println("결과: "+count);
		
		//제어문
		/*
		 if문
		 switch문
		 조건문: 특정 조건을 평가하여 그 결과에 따른
		 다른 코드를 실행한다
		 
		 if(조건식){ <= true or false
		 	코드 내용(참일때 실행)
		 	}
		 
		 if-else문
		 조건이 참일때와 거짓일 때 각각 다른 코드를 실행
		 if(조건식){
		 
		 }else{
		 	조건이 거짓일 때 실행
		 }
		 
		 else-if문: 여러 개의 조건을 평가
		 if(조건식1){
		 }else if(조건식2){
		 }else if(조건식3){
		 }else{
		 	모든 조건이 거짓일 때 실행
		 }
		 
		 
		 
		 */
		
		boolean isData = false;
		//bool타입 변수는 앞에 is로 시작한다(규칙)
		if(!isData) {
			System.out.println("A출력");
		}else {
			System.out.println("B출력");
		}
		
		//두 비밀번호 비교하기
		String password = "123"; //입력
		String rePassword = "456"; //재입력
		// "==" : 비교연산자
		// 자바에서는 문자를 비교할 때 equals를 사용
		if(password.equals(rePassword)) {
			//문자열 함수로 문자를 비교한다.
			System.out.println("비밀번호가 일치합니다.");
		}
		
		//아래에 비밀번호가 일치하지 않다를 if로 나타내시오
		// != :일치 x
		
		if(!password.equals(rePassword)) {
			System.out.println("비밀번호가 불일치합니다.");
		}
		
		if(10 != 5) {
			System.out.println("A 출력");
		}else {
			System.out.println("B 출력");
		}
		
		//반복문 복습
		/*
		 반복문 : 특정 블록의 코드를 여러 번 반복해서 실행
		 for: 반복 횟수가 정해져 있을 때 사용
		 while: 조건이 참인 동안 반복실행(반복횟수 x)
		 
		 for(초기화;조건식;증감식;){
		 	반복할 코드
		 }
		 
		 while(조건식(1)){
		 	//반복할 코드(2)
		 }
		 */
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		/*
		 배열: 동일한 데이터 타입의 여러 데이터를 하나의
		 변수로 관리할 수 있게 해주는 자료구조
		 쉽게 말해 같은 종류의 데이터들을 한 줄로 나열해
		 놓은 것!
		 for문하고 같이 자주 쓰임
		 */
		
		//배열 선언 및 초기화
		int [] array = {1,2,3,4};
		int [] array2 = new int[4];
		
		//배열 요소 접근 및 조작
		System.out.println("0번 index: "+array[0]+"요소");
		System.out.println("1번 index: "+array[1]+"요소");
		System.out.println("2번 index: "+array[2]+"요소");
		System.out.println("3번 index: "+array[3]+"요소");
		
		//인덱스 번호로 배열 요소 출력(사용) 가능
		for(int i=0;i<array.length;i++) {
			System.out.println(i+"번 index: "+array[i]+"요소");
		}
		
		//배열 요소 값 변경하기
		array[2] = 50;
		System.out.println("2번 index: "+array[2]+"요소");
		
		//myScore보다 점수 높은 사람 카운트하기
		int []score = {50,80,100,100,90};
		int myScore = 77;
		int count1 = 0;
		
		for(int i=0;i<score.length;i++) {
			if(myScore<score[i]) {
				count1++;
			}
		}
		System.out.println(count1);
		
//		for(int i=0;i<score.length;i++) {
//			int temp = score[i];
//			System.out.println("배열에서 가져온 점수:" +temp);
//			
//			if(temp > myScore) {
//				++count1;
//			}
//		}
		System.out.println(count1);
		
		// 배열에서 최댓값 찾기
		int numbers[] = {12,45,7,23,56,89,34};
		int max = 0;
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>max) {
				max = numbers[i];
			}
		}
		System.out.println("가장 큰 값은: "+max+"입니다.");
		
		
		//닉네임 중복체크
		String nickNames[] = {"사과","바나나","오렌지","포도","키위"};
		String userNickName = "사과";
		
		boolean isFlag = false;
		//플래그값 (0아니면1)
		for(int i=0;i<nickNames.length; i++) {
			if(userNickName.equals(nickNames[i])) {
				isFlag = true;
				//System.out.println("닉네임이 중복됩니다.");
			}
		}
		//플래그를 활용한 코딩
		if(isFlag) {
			System.out.println("닉네임이 중복됩니다.");
			//처음에 false였는데 true로 변했다면 중복된 닉네임이 있다는 것
		}
		
		
		//모든 배열의 요소 합 구하기
		//for-each 사용하기
		int numbers2[] = {5,15,10,20,25};
		int sum = 0;
		
		for(int i : numbers2) {
			sum += i;
		}
		System.out.println("요소의 총합: "+sum);
		
	}

}
