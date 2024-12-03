package java_study_1203;

public class 문제풀이 {

	public static void main(String[] args) {

		//4
		String text = "Hello World!";
		System.out.println(text.toUpperCase());

		//5
		String x = "고구마";
		String y = "고구마";
		if(x==y) {
			// 위에 코드는 문자를 비교하는게 아닌
			// 메모리에 저장된 주소를 비교하는 것
			System.out.println("같습니다.");
		}
		
		if(x.equals(y)) {
			System.out.println("같습니다.");
		}
		
		//6
		String h = "안녕하세요";
		System.out.println(h.substring(0,1));
		System.out.println(h.substring(h.length()-1,h.length()));
		
		//8
		String word = "aabbacccaaaaa";
		String array[] = word.split("");
		int count = 0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i].equals("a")) {
				++count;
			}
		}
		System.out.println("총: "+count);
		
		String a = array[0];
		System.out.println(a);
		
		for(String i : array) {
			//배열의 길이만큼 자동으로 반복
			//for-each문
			System.out.println("배열 값: "+i);
		}
		
		//10
		String strArr[] = {"and","notag","abcd"};
		for(String i : strArr) {
			if(!i.contains("ad")) {
				//ad가 포함되어 있다면 !
				//ad가 없다면
				System.out.println(i);
				/*
			if(i.contains("ad") == true){
				잘못된 코드
				contains가 true/false인데 한번 더
				true를 비교할 필요는 없다.
			}
				 */
			}
		}
	
		//11
		//모음을 제거
		String my_string = "nice to meet you";
		String vow[] = {"a","e","i","o","u"};
		
		for(String i : vow) {
			//2. 모음을 for-each로 돌린다.
			my_string = my_string.replaceAll(i, "");
		}
		System.out.println(my_string);
		
		
		//12
		String numbers = "onefourzerosixseven";
		//결과 : 14067
		String matchNumbers[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		//배열 초기화

		for(int i = 0; i<matchNumbers.length;i++) {
			//replaceAll로 특정 단어 숫자로 교체
			String n = matchNumbers[i];
			numbers = numbers.replaceAll(matchNumbers[i], Integer.toString(i));
			//Integer.toString: 숫자에서 문자로 변환
			//matchNumbers[i]를 n으로 바꾸어도 동일
		}
		System.out.println("정답: "+numbers);
	}

}
