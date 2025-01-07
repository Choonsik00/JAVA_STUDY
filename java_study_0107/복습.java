package java_study_0107;

import java.util.ArrayList;

class Book{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		   this.title = title;
		   this.author = author;
		}

	public String getTitle() {
		   return title;
	}

	public String getAuthor() {
		   return author;
	 }

}
public class 복습 {
	
	public static void main(String[] args) {
		/*
		 * 제네릭과 컬렉션즈
		 * ArrayList, HashMap, HashSet(코딩테스트시 조금사용)
		 * <> : 제네릭
		 */
		ArrayList<Book> bookList = new ArrayList<>();
		//Ctrl+shift+o ArrayList 임토프하기
		
		//Book 추가하기
		bookList.add(new Book("A도서","홍길동"));
		//new로 추가(변수 생성없이)
		
		Book book = new Book("B도서","김길동");
	
		bookList.add(book); //Book 변수 생성 후 추가
		
		//Book 조회하기
		for(Book b: bookList) {
			System.out.println("제목: "+b.getTitle()+","+"저자: "+b.getAuthor());
		}
		
		//특정 Book 조회
		Book book1 = bookList.get(1); //첫번째 저장된 Book 가져오기
		System.out.println("제목: "+book1.getTitle()+","+"저자: "+book1.getAuthor());
		
		//List 사이즈 조회
		System.out.println("길이: "+bookList.size());
		
		/*
		 * 공부순서
		 * 
		 * 배열 -> 객체 배열(배열에 객체 저장하고 가져오는 방법)
		 * -> 제네릭과 컬렉션즈 -> 콘솔 프로젝트(도서관)
		 */
	}
}
