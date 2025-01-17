package java_study_1224;

/*
 * interface OR class 명명규칙
 * 대문자로 시작(모든 언어 규칙)
 */
public interface Account {
	//첫번째 순서 인터페이스 만들기
	
	/*
	 * 인터페이스 특징
	 * 1. 구현 불가능, 선언만 가능합니다.
	 * 2. public만 작성할 수 있습니다.
	 */
	
	void deposit(double amount); //입금
	boolean withdraw(double amount); //출금
	public double getBalance(); //잔액조회
	public String getAccountNumber();
	
}
