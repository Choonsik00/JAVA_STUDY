package library;

import java.util.ArrayList;

public class LibraryServiceImpl implements LibraryService{

	private ArrayList<book> books;
	
	public LibraryServiceImpl() {
		books = new ArrayList<>();
	}

	@Override
	public void addBook(book book) {
		books.add(book); //ArrayList에 book 추가 (도서 추가)
		System.out.println("도서가 추가되었습니다.");
	}

	@Override
	public void searchBook(String keyword) { //도서 검색
		boolean isSearch = false;
		for(book book:books) {
			if(book.getTitle().contains(keyword)||
			   book.getAuthor.contains(keyword)||
			   book.getIsbn.contains(keyword)) {
				System.out.println(book);
				isSearch = true;
			}
		}
		if(!isSearch) {
			System.out.println("검색 결과가 없습니다.");
		}
	}

	@Override
	public void removeBook(String isbn) {

		for(int i=0;i<books.size();i++) {
			book book = books.get(i);
			if(books.getIsbn().equals(isbn)) { //도서 고유번호가 같다면
				books.remove(i); //해당 도서 제거
				System.out.println("도서가 삭제 되었습니다.");
			}
		}
		
	}

	@Override
	public ArrayList<book> getAllBooks() {
		// TODO Auto-generated method stub
		return new ArrayList<>(books); //books ArrayList 리턴
	}
	

}
